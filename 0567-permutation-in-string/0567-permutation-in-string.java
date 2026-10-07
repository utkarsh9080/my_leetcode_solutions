// class Solution {
//     public boolean checkInclusion(String s1, String s2) {
//         char[] arr = s1.toCharArray();
//         Arrays.sort(arr);
//         s1=new String(arr);
//         int l = s1.length();
//         for(int i=0;i<s2.length();i++){
//             if(i+l>s2.length()){
//                 return false;
//             }
//             String sub = s2.substring(i,i+l);
//             char[] a1 = sub.toCharArray();
//             Arrays.sort(a1);
//             sub=new String(a1);
//             if(s1.equals(sub)){
//                 return true;
//             }

//         }
//         return false;
//     }
// }



//^ worst possible solution
class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length())
            return false;

        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();

        for (char c : s1.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        int l = s1.length();

        for (int i = 0; i < s2.length(); i++) {

            char c = s2.charAt(i);
            window.put(c, window.getOrDefault(c, 0) + 1);

            // Remove leftmost character when window gets too big
            if (i >= l) {
                char remove = s2.charAt(i - l);

                window.put(remove, window.get(remove) - 1);

                if (window.get(remove) == 0) {
                    window.remove(remove);
                }
            }

            if (need.equals(window)) {
                return true;
            }
        }

        return false;
    }
}

//okayish


// class Solution {
//     public boolean checkInclusion(String s1, String s2) {

//         if (s1.length() > s2.length()) return false;

//         int[] need = new int[26];
//         int[] window = new int[26];

//         for (char c : s1.toCharArray()) {
//             need[c - 'a']++;
//         }

//         int l = s1.length();

//         for (int i = 0; i < s2.length(); i++) {

//             window[s2.charAt(i) - 'a']++;

//             // Keep window size = s1.length()
//             if (i >= l) {
//                 window[s2.charAt(i - l) - 'a']--;
//             }

//             if (Arrays.equals(need, window)) {
//                 return true;
//             }
//         }

//         return false;
//     }
// }
// best
