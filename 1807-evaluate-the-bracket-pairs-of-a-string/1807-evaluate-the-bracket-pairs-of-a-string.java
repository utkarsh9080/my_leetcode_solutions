
//my codeeeee i hate this 

// class Solution {
//     public String evaluate(String s, List<List<String>> knowledge) {
//         StringBuilder sb = new StringBuilder();
//         Map<String,String> mapp = new HashMap<>();
//         for(List<String> k: knowledge){
//             mapp.put(k.get(0),k.get(1));
//         }
//         for(int i=0;i<s.length();i++){
//             if(s.charAt(i)!='('){
//                 sb.append(s.charAt(i));
//             }else{
//                 i++;
//                 StringBuilder sb1 = new StringBuilder();
//                 while(s.charAt(i)!=')'){
//                     sb1.append(s.charAt(i));
//                     i++;
//                 }
//                 sb.append(mapp.getOrDefault(sb1.toString(),"?"));
//             }
            
//         }
//         return sb.toString();
//     }
// }


//another nigga's code 

class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        // Create a HashMap to store key-value pairs from knowledge base
        // Each entry maps a key (first element) to its value (second element)
        Map<String, String> knowledgeMap = new HashMap<>(knowledge.size());
      
        // Populate the map with knowledge pairs
        for (List<String> pair : knowledge) {
            knowledgeMap.put(pair.get(0), pair.get(1));
        }
      
        // StringBuilder to efficiently build the result string
        StringBuilder result = new StringBuilder();
      
        // Iterate through each character in the input string
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                // Found opening bracket, find the corresponding closing bracket
                int closingBracketIndex = s.indexOf(')', i + 1);
              
                // Extract the key between brackets (excluding the brackets themselves)
                String key = s.substring(i + 1, closingBracketIndex);
              
                // Replace the bracketed expression with its value from the map
                // If key doesn't exist, use "?" as default
                result.append(knowledgeMap.getOrDefault(key, "?"));
              
                // Move the index to the closing bracket position
                // (loop will increment it by 1 in the next iteration)
                i = closingBracketIndex;
            } else {
                // Regular character, append it directly to the result
                result.append(s.charAt(i));
            }
        }
      
        // Convert StringBuilder to String and return
        return result.toString();
    }
}