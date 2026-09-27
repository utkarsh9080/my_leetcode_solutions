// class Solution {
//     public String reverseParentheses(String s) {
//         StringBuilder sb = new StringBuilder();
//         for(int i=s.length()-1;i>=0;i--){
//             if(s.charAt(i)==')'){
//                 i--;
//                 StringBuilder sb1 = new StringBuilder();
//                 while(s.charAt(i)!='('){
//                     sb1.append(s.charAt(i));
//                     i--;
//                 }
//                 sb.append(sb1);
//             }
//             if(s.charAt(i)=='('){
//                 continue;
//             }
//             sb.append(s.charAt(i));
//         }
//         return sb.toString();
//     }
// }

// this was failed approach 

class Solution {
    public String reverseParentheses(String s) {

        Stack<StringBuilder> stack = new Stack<>();
        StringBuilder current = new StringBuilder();

        for (char c : s.toCharArray()) {

            if (c == '(') {
                stack.push(current);
                current = new StringBuilder();

            } else if (c == ')') {
                current.reverse();

                StringBuilder previous = stack.pop();
                previous.append(current);

                current = previous;

            } else {
                current.append(c);
            }
        }

        return current.toString();
    }
}