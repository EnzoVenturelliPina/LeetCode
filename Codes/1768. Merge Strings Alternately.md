# Intuition
I thought about traversing both words only once, alternately adding the letters to a variable that would form the new word. To achieve this, I used a StringBuilder, which allows efficient character addition using the append method.

# Approach
With a while loop, I traversed both words simultaneously, ensuring that each character was processed only once. Inside the loop, I used if conditions to check if there were still characters available in each word and, if so, added them to the StringBuilder.

# Complexity
**Time complexity:**
The algorithm traverses both input strings (word1 and word2) once, where n is the length of word1 and m is the length of word2. Since each character is processed only once, the time complexity is linear with respect to the combined length of the two strings.

**Space complexity:**
The StringBuilder stores the merged result, which, in the worst case, will have a length equal to the sum of the lengths of word1 and word2. Therefore, the space complexity is proportional to the combined length of the two input strings.

# Code
### Java
```Java
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
```
