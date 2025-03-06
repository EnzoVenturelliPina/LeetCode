# Intuition
Initially, I thought about converting the integer into a string and comparing the last element with the first, as this approach would be simpler than performing successive divisions based on the number's length if I were to work directly with the digits.

# Approach
I converted the integer into a string and then, using a for loop and an if statement, compared the first element with the last. If at any point the compared elements were different, the function would return false. After the loop, if no differences were found, the function would return true.

# Complexity
**Time complexity:**
O(n), where n is the number of digits in the input number. The loop runs through half of the string.

**Space complexity:**
O(n), as the number is converted into a string, requiring additional space proportional to the number of digits.
