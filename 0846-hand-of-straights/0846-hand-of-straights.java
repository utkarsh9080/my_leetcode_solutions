// Arrays.sort(hand);
        // boolean m = true;
        // for(int i=0;i<hand.length;i++){
        //     int num = hand[i];
        //     int j=i++;
        //     while(j<=3){
        //         if((num+1)==hand[j]){
        //             j++;
        //             num++;
        //         }else{
        //             m=false;
        //             break;
        //         }
        //     }
        //     if(!m){
        //         break;
        //     }
        // }
        // return m;
        // chutiya approach me tho bolta hu 

class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length%groupSize!=0){
            return false;
        }
        Arrays.sort(hand);
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int f : hand){
            freq.put(f,freq.getOrDefault(f,0)+1);
        }
        for(int chad: hand){
            if(freq.get(chad)==0){
                continue;
            }
            for(int j=0;j<groupSize;j++){
                int current = chad+j;
                if(freq.getOrDefault(current,0)==0){
                    return false;
                }
                freq.put(current,freq.get(current)-1);
            }
        }
        return true;
    }
}