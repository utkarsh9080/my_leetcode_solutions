// class Solution {
//     public int minDeletions(String s) {
//         HashMap<Character,Integer> hm = new HashMap<>();
//         for(int i=0;i<s.length();i++){
//             hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);
//         }
//         int[] valuearray = hm.values().toArray(new Integer[0]);
//         Arrays.sort(valuesarray , Collections.reverseOrder());
//         int count=0;
//         for(int i=1;i<valuearray.length;i++){
//             if(valuearray[i-1]<valuearray[i]){
//                 valuearray[i] = valuearray[i]-1;;
//                 count++;
//             }
//         }
//         return count;
//     }
// }

class Solution {
    public int minDeletions(String s) {

        HashMap<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);
        }

        Integer[] freq = hm.values().toArray(new Integer[0]);
        Arrays.sort(freq, Collections.reverseOrder());

        HashSet<Integer> used = new HashSet<>();
        int count = 0;

        for (int f : freq) {

            while (f > 0 && used.contains(f)) {
                f--;
                count++;
            }

            if (f > 0) {
                used.add(f);
            }
        }

        return count;
    }
}