class Solution {
    public boolean isPalindrome(int x) {
        String palindrome = String.valueOf(x);
        int aux = palindrome.length() - 1;
        for (int i = 0; i < (palindrome.length())/2; i++){
            if (palindrome.charAt(i) != palindrome.charAt(aux)){
                return false;
            }
            aux--;
        }
        return true;
    }
}