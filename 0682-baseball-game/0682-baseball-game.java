class Solution {
    public int calPoints(String[] op) {
        ArrayList<Integer> ls = new ArrayList<>();
        for(int i=0;i<op.length;i++){
            if(op[i].equals("C")){
                ls.remove(ls.size()-1);
            }else
            if(op[i].equals("D")){
                ls.add(2*ls.get(ls.size()-1));
            }else
            if(op[i].equals("+")){
                ls.add(ls.get(ls.size()-1)+ls.get(ls.size()-2));
            }else{
                ls.add(Integer.parseInt(op[i]));
            }
            
        }
        int sum=0;
        for(int num:ls){
            sum+=num;
        }
        return sum;
    }
}