class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(String i : tokens){
            if(i.equals("*")){
                int num1=st.peek();
                st.pop();
                int num2=st.peek();
                st.pop();
                st.push(num1*num2);
                
            }else
            if(i.equals("+")){
                int num1=st.peek();
                st.pop();
                int num2=st.peek();
                st.pop();
                st.push(num1+num2);
            }else
            if(i.equals("-")){
                int num1=st.peek();
                st.pop();
                int num2=st.peek();
                st.pop();
                st.push(num2-num1);
            }else
            if(i.equals("/")){
                int num1=st.peek();
                st.pop();
                int num2=st.peek();
                st.pop();
                st.push(num2/num1);
            }else{
                st.push(Integer.parseInt(i));
            }
        }
        return st.peek();
    }
}