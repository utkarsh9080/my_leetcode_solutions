class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        StringBuilder st = new StringBuilder();
        // we counted frequency here -->
        for(int i=0;i<s.length();i++){
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }
        //generated a list with entire entryset of hashmap then sorted it by value using comparable
        List<Map.Entry<Character,Integer>> ls = new ArrayList<>(hm.entrySet());
        ls.sort((a,b)->b.getValue()-a.getValue());

        // itrating thru the entry set
        for(Map.Entry<Character,Integer> entry : ls){
            char c = entry.getKey();
            int freq = entry.getValue();
            for(int i=0;i<freq;i++){
                st.append(c);
            }
        }
        return st.toString();
    }
}