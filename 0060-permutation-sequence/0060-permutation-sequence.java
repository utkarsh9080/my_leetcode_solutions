class Solution {
    public String getPermutation(int n, int k) {
        ArrayList<Integer> nums = new ArrayList<>();
        for( int i=1;i<=n;i++){
            nums.add(i);
        }
        StringBuilder st = new StringBuilder();
        k--;
        for(int remaining=n;remaining>=1;remaining--){
            int fact =1;
            for(int i=1;i<remaining;i++){
                fact*=i;
            }
            int index = k/fact;
            st.append(nums.get(index));
            nums.remove(index);
            k=k%fact;
        }
        return st.toString();
    }
}