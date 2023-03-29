class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        int i=0, j=0;

        while(i<word.length() && j<abbr.length()){

            if(word.charAt(i) == abbr.charAt(j)){
                i++; j++;
                continue;
            }

            //if the above char's didn't match, check whether the abbr char is a digit
            if(!Character.isDigit(abbr.charAt(j)))
                return false;

            //build the number
            StringBuilder number = new StringBuilder();
            while(j<abbr.length() && Character.isDigit(abbr.charAt(j))){
                number.append(abbr.charAt(j++));
            }

            //if number starts with 0, return false;
            if(number.charAt(0) == '0')
                return false;

            // add the number to i, to start comparing characters in the next iteration
            i = i + Integer.parseInt(number.toString());
        }


        return i == word.length() && j == abbr.length();
    }
}