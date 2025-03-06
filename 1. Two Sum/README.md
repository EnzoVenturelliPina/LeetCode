# Intuition
The first version used two nested loops, resulting in O(n²) complexity. However, I considered adopting a more efficient solution with O(n) complexity.

# Approach
I adopted a different approach by performing the calculation based on the complement of the sum. To achieve this, I used a HashMap to store the values and their respective indices in the nums array. The idea was to check if the complement required to reach the target was already present in the map. If the complement existed, the code would return the two positions in the array whose sum equals the target. If the complement was not found, the current value and its index would be added to the map for future checks.

# Complexity
**Time complexity:**
O(n), as the array is traversed once and operations on the HashMap are O(1) on average.

**Space complexity:**
O(n), due to storing the numbers in the HashMap.
