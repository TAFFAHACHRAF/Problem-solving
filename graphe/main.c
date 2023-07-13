#include <stdio.h>
#include <stdlib.h>

struct node {
  int vertex;
  struct node* next;
};

struct node* createNode(int);

struct Graph {
  int numVertices;
  struct node** adjLists;
};

// Create a node
struct node* createNode(int v) {
  struct node* newNode = malloc(sizeof(struct node));
  newNode->vertex = v;
  newNode->next = NULL;
  return newNode;
}

// Create a graph
struct Graph* createAGraph(int vertices) {
  struct Graph* graph = malloc(sizeof(struct Graph));
  graph->numVertices = vertices;

  graph->adjLists = malloc(vertices * sizeof(struct node*));

  int i;
  for (i = 0; i < vertices; i++)
    graph->adjLists[i] = NULL;

  return graph;
}

// Add edge
void addEdge(struct Graph* graph, int s, int d) {
  // Add edge from s to d
  struct node* newNode = createNode(d);
  newNode->next = graph->adjLists[s];
  graph->adjLists[s] = newNode;

  // Add edge from d to s
  newNode = createNode(s);
  newNode->next = graph->adjLists[d];
  graph->adjLists[d] = newNode;
}

// Print the graph
void printGraph(struct Graph* graph) {
  int v;
  for (v = 0; v < graph->numVertices; v++) {
    if (graph->adjLists[v] != NULL) {
      struct node* temp = graph->adjLists[v];
      printf("[%d]=> ", v);
      while (temp) {
        printf("%d -> ", temp->vertex);
        temp = temp->next;
      }
      printf("#\n");
    }
  }
}

// Check if data exists in the graph
void dataExist(struct Graph* graph, int data) {
  int v;
  for (int i = 0; i < graph->numVertices; i++) {
    struct node* temp = graph->adjLists[i];
    while (temp != NULL) {
      if (temp->vertex == data) {
        printf("%d exists in this graph\n", data);
        return;
      }
      temp = temp->next;
    }
  }
  printf("%d does not exist in the graph\n", data);
}

// Structure to store the path
struct QueueNode {
  int vertex;
  struct QueueNode* next;
};

// Enqueue a vertex to the queue
void enqueue(struct QueueNode** queue, int vertex) {
  struct QueueNode* newNode = malloc(sizeof(struct QueueNode));
  newNode->vertex = vertex;
  newNode->next = NULL;

  if (*queue == NULL) {
    *queue = newNode;
  } else {
    struct QueueNode* curr = *queue;
    while (curr->next != NULL) {
      curr = curr->next;
    }
    curr->next = newNode;
  }
}

// Dequeue a vertex from the queue
int dequeue(struct QueueNode** queue) {
  if (*queue == NULL) {
    return -1;
  }

  struct QueueNode* temp = *queue;
  int vertex = temp->vertex;
  *queue = (*queue)->next;
  free(temp);

  return vertex;
}

// Check if the queue is empty
int isQueueEmpty(struct QueueNode* queue) {
  return queue == NULL;
}

// Print the shortest path from source to destination
void printShortestPath(struct Graph* graph, int source, int destination) {
  int* visited = calloc(graph->numVertices, sizeof(int));
  int* parent = malloc(graph->numVertices * sizeof(int));
  int* distance = malloc(graph->numVertices * sizeof(int));

  struct QueueNode* queue = NULL;

  // Initialize parent and distance arrays
  int i;
  for (i = 0; i < graph->numVertices; i++) {
    parent[i] = -1;
    distance[i] = -1;
  }

  // Mark the source vertex as visited and enqueue it
  visited[source] = 1;
  distance[source] = 0;
  enqueue(&queue, source);

  // Perform BFS
  while (!isQueueEmpty(queue)) {
    int currentVertex = dequeue(&queue);

    struct node* temp = graph->adjLists[currentVertex];
    while (temp) {
      int adjacentVertex = temp->vertex;

      if (!visited[adjacentVertex]) {
        visited[adjacentVertex] = 1;
        parent[adjacentVertex] = currentVertex;
        distance[adjacentVertex] = distance[currentVertex] + 1;
        enqueue(&queue, adjacentVertex);
      }

      temp = temp->next;
    }
  }

  // Check if a path exists from source to destination
  if (distance[destination] == -1) {
    printf("No path exists between %d and %d\n", source, destination);
  } else {
    printf("Shortest path from %d to %d: ", source, destination);
    int currentVertex = destination;
    printf("%d", currentVertex);

    while (parent[currentVertex] != -1) {
      printf(" <- %d", parent[currentVertex]);
      currentVertex = parent[currentVertex];
    }

    printf("\n");
    printf("Shortest distance: %d\n", distance[destination]);
  }

  free(visited);
  free(parent);
  free(distance);
}

int getMaxValue(struct Graph *graph){
  int v=0;
  int max=-88888;
  for(int i=0;i<graph->numVertices;i++){
    struct node* temp;
    temp=graph->adjLists[i];
    while(temp != NULL){
      if(temp->vertex >  max){
        max=temp->vertex;
      }
      temp=temp->next;
    }
  }
  return max;
}

int getMinValue(struct Graph *graph){
  int v=0;
  int min=graph->numVertices;
  for(int i=0;i<graph->numVertices;i++){
    struct node* temp;
    temp=graph->adjLists[i];
    while(temp != NULL){
      if(temp->vertex <  min){
        min=temp->vertex;
      }
      temp=temp->next;
    }
  }
  return min;
}

int main() {
  struct Graph* graph = createAGraph(8000);
  addEdge(graph, 9, 8);
  addEdge(graph, 8, 999);
  addEdge(graph, 8, 999);
  addEdge(graph, 999, 87);
  addEdge(graph, 578, 87);
  addEdge(graph, 999, 1700);
  addEdge(graph, 57, 87);
  addEdge(graph, 87, 3);
  addEdge(graph, 8, 74);

  printGraph(graph);

  dataExist(graph, 875);

  printf("\nShortest Path:\n");
  printShortestPath(graph, 0, 5);

  printf("the max value is : %d\n",getMaxValue(graph));
  printf("the min value is : %d",getMinValue(graph));

  return 0;
}
