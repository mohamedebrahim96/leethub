class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Boolean> mapNums1 = new HashMap<>();
        for(int val : nums1){
            mapNums1.put(val, true);
        }
        List<Integer> listIntersection = new ArrayList<>();
        for(int val : nums2){
            if(null != mapNums1.get(val)) {
                listIntersection.add(val);
                mapNums1.remove(val);
            }
        }
    
        int lenResult = listIntersection.size();
        int[] result = new int[lenResult];
        for(int i = 0; i < lenResult; i++){
            result[i] = listIntersection.get(i);
        }
        return result;
    }
}