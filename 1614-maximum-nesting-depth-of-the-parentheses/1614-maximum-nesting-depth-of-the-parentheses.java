
//STACK SOLUTION 

// class Solution {
//     public int maxDepth(String s) {
//         Stack<String> st = new Stack<>();
//         int c1=0;
//         int count = 0;
//         for(int i=0;i<s.length();i++){
//             if(s.charAt(i)=='('){
//                 st.push("(");
//                 c1=st.size();
//                 count=Math.max(count,c1);
//             }
//             if(s.charAt(i)==')'){
//                 st.pop();
//             }
//         }
//         return count;
//     }
// }



//ITERATIVE SOL

class Solution {
    public int maxDepth(String s) {
        int count=0;
        int max=0;
        for(char c:s.toCharArray()){
            if(c == '('){
                count++;
                if(max<count)
                    max=count;
            }else if(c ==')'){
                count--;
            }
        }

        
        return max;
    }
}