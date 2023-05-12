class Solution {
   public int shortestDistance(String[] wordsDict, String word1, String word2) {
	var distance = Integer.MAX_VALUE;

	for (int i = 0, index1 = -1, index2 = -1; i < wordsDict.length; i++) {
		var word = wordsDict[i];
		if (word.equals(word1))
			index1 = i;
		else if (word.equals(word2))
			index2 = i;
		if (index1 != -1 && index2 != -1)
			distance = Math.min(distance, Math.abs(index1 - index2));
	}
	return distance;
}
}