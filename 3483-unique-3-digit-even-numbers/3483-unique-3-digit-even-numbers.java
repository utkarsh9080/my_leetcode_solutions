    class Solution {
        int count = 0;
        public int totalNumbers(int[] digits) {
            count=0;
            boolean[] used = new boolean[digits.length];
            combi(digits,used,0,0);
            return count;
        }
        public void combi(int[] digits,boolean[] used,int number,int length){
            if(length==3){
                if(number%2==0){
                    count++;
                }
                return;
            }
            boolean[] usedatlevel = new boolean[10];
            for(int i=0;i<digits.length;i++){
                if(usedatlevel[digits[i]]){
                    continue;
                }
                if(used[i]){
                    continue;
                }
                if(length==0&&digits[i]==0){
                    continue;
                }
                usedatlevel[digits[i]]=true;
                used[i]=true;
                int newnumber = number*10+digits[i];
                combi(digits,used,newnumber,length+1);
                used[i]=false;
            }


        }
    }