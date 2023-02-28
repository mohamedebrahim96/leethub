class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> curr = new ArrayList<Integer>();

        for(int i=0; i<=rowIndex; i++){
            curr.add(1);
            for(int j=i-1;j>0;j--){
                curr.set(j, curr.get(j-1)+curr.get(j));
            }
        }
        return curr;
    }
}
