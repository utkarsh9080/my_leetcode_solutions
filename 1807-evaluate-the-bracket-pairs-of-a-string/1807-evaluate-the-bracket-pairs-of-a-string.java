class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        StringBuilder sb = new StringBuilder();
        Map<String,String> mapp = new HashMap<>();
        for(List<String> k: knowledge){
            mapp.put(k.get(0),k.get(1));
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='('){
                sb.append(s.charAt(i));
            }else{
                i++;
                StringBuilder sb1 = new StringBuilder();
                while(s.charAt(i)!=')'){
                    sb1.append(s.charAt(i));
                    i++;
                }
                sb.append(mapp.getOrDefault(sb1.toString(),"?"));
            }
            
        }
        return sb.toString();
    }
}