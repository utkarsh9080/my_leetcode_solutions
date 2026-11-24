// class Solution {
//     public boolean judgeCircle(String moves) {
//         int x = 0, y = 0;

//         for(int i = 0; i < moves.length(); i++) {
//             if(moves.charAt(i) == 'U') {
//                 y++;
//             }
//             else if(moves.charAt(i) == 'D') {
//                 y--;
//             }
//             else if(moves.charAt(i) == 'R') {
//                 x++;
//             }
//             else if(moves.charAt(i) == 'L') {
//                 x--;
//             }
//         }

//         return x == 0 && y == 0;
//     }
// }



class Solution {
     static {
        String[] arr = new String[1];
        for (int i = 0; i < 500; i++) {
            judgeCircle("");
        }
    }
    static public boolean judgeCircle(String moves) {

        if(moves.length()%2!=0) return false;
        int[] frence=new int[26];

        for(char movesIt:moves.toCharArray()) frence[movesIt-'A']++;

     return (frence['U'-'A']==frence['D'-'A'] && frence['R'-'A']==frence['L'-'A']);   
    }
}