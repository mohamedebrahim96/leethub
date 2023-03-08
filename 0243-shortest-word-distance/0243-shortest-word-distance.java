class Solution {
    public int shortestDistance(String[] wordsDict, String word1, String word2) {
        int indexOne = -1;
        int indexTwo = -1;
        int minDis = Integer.MAX_VALUE;

        // for every word in the input array
        for(int i=0 ; i < wordsDict.length; i++){
            // if its word1
            if(wordsDict[i].equals(word1)){
                // mark the resective index
                indexOne = i;
                // and if word2 is already seen, calculate the minDis
                if(indexTwo != -1){
                    // indexOne > indexTwo
                    minDis = Math.min(minDis, indexOne - indexTwo);
                }
            }
            // same for word2, if found check if word1 is already seen and
            // calculate min distance accordingly
            else if(wordsDict[i].equals(word2)){
                indexTwo = i;
                if(indexOne != -1){
                    // indexTwo > indexOne
                    minDis = Math.min(minDis, indexTwo - indexOne);
                }
            } 
        }

        return minDis;
    }
}