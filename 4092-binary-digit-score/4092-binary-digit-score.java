class Solution {
    public int calculateScore(int a, int b) {
        // int aa=Integer.parseInt(Integer.toBinaryString(a));
        // int bb=Integer.parseInt(Integer.toBinaryString(b));
        int counta = Integer.bitCount(a);
        int countb = Integer.bitCount(b);
        if(counta>=countb) return counta*countb;
        return countb/counta;
    }
}