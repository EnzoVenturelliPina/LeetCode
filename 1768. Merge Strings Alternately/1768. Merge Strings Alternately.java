class Solution {
    public String mergeAlternately(String word1, String word2) {
        String merged = new StringBuilder();
        int i = 0;
        while ((word1.length() > i) | (word2.length() > i)){
            if(word1.length() > i){
                merged.append(word1.charAt(i));
            }
            if(word2.length() > i){
                merged.append(word2.charAt(i));
            }
            i++;
        }
        return merged.toString();
    }
}