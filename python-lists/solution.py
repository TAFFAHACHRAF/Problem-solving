if __name__ == '__main__':
    N = int(input()) # read the number of commands
    my_list = [] # initialize an empty list
    for i in range(N):
        cmd = input().split() # read the command
        if cmd[0] == 'insert':
            my_list.insert(int(cmd[1]), int(cmd[2]))
        elif cmd[0] == 'print':
            print(my_list)
        elif cmd[0] == 'remove':
            my_list.remove(int(cmd[1]))
        elif cmd[0] == 'append':
            my_list.append(int(cmd[1]))
        elif cmd[0] == 'sort':
            my_list.sort()
        elif cmd[0] == 'pop':
            my_list.pop()
        elif cmd[0] == 'reverse':
            my_list.reverse()
        else : 
            print("Please insert the correcte commande")
