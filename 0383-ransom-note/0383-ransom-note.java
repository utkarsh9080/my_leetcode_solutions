class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // return magazine.contains(ransomNote);
        Map<Character,Integer> hmap = new HashMap<>();
        Map<Character,Integer> hmapp = new HashMap<>();
        for(int i=0;i<ransomNote.length();i++){
            hmap.put(ransomNote.charAt(i),hmap.getOrDefault(ransomNote.charAt(i), 0) + 1);
        }
        for(int i=0;i<magazine.length();i++){
            hmapp.put(magazine.charAt(i),hmapp.getOrDefault(magazine.charAt(i), 0) + 1);
        }
        for (char key : hmap.keySet()) {
            if (!hmapp.containsKey(key) || hmapp.get(key)<(hmap.get(key))) {
                return false;
            }
        }
        return true;
    }
}