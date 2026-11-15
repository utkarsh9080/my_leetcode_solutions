class Solution {
    public String reverseVowels(String s) {
        ArrayList<Character> vowels = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u','A','E','I','O','U'));
        StringBuilder sb = new StringBuilder(s);
        // for(int i=0;i<s.length();i++){
        //     if(vowels.contains(s.charAt(i))){
        //         char temp=s.charAt(i);
        //         sb.setCharAt(i,s.charAt(s.length()-i-1));
        //         sb.setCharAt(s.length()-i-1,temp);
        //     }
        // }
        int left=0;
        int right = s.length()-1;
        while(left<right){
            if(!vowels.contains(sb.charAt(left))){
                left++;
                continue;
            }
            if(!vowels.contains(sb.charAt(right))){
                right--;
                continue;
            }
            char temp=sb.charAt(left);
            sb.setCharAt(left,s.charAt(right));
            sb.setCharAt(right,temp);
            left++;
            right--;    
        }
        return sb.toString();
    }
}