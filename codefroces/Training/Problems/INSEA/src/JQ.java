/*
public class JQ {

    public static void main(String[] args) {
        // Example JSON input
        String jsonInput = "{ \"name\": \"John\", \"age\": 30, \"city\": \"New York\", \"nested\": { \"key\": \"value\" } }";

        // Example JSON path queries
        String[] queries = { "name", "age", "city", "nested.key", "nonexistent" };

        // Parse JSON input
        JSONObject jsonObject = new JSONObject(jsonInput);

        // Answer JSON path queries
        for (String query : queries) {
            String result = getValueByJsonPath(jsonObject, query);
            System.out.println("Query: " + query + " Result: " + result);
        }
    }

    private static String getValueByJsonPath(JSONObject jsonObject, String jsonPath) {
        String[] pathSegments = jsonPath.split("\\.");
        JSONObject currentObject = jsonObject;

        for (String segment : pathSegments) {
            if (currentObject.has(segment)) {
                Object value = currentObject.get(segment);

                if (value instanceof JSONObject) {
                    currentObject = (JSONObject) value;
                } else {
                    return value.toString();
                }
            } else {
                return "None";
            }
        }

        return currentObject.toString();
    }
}
*/