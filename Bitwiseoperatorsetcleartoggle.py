# Given two integers N and K, write a program to compute the following:

# The result after setting Kth bit of N.
# The result after clearing Kth bit of N.
# The result after toggling Kth bit of N.
# Input Format

# Single line consisting of N and K.
# Constraints

# 1 <= N <= 10^9
# 1 <= K <= 32
# Output Format

# Output a line with an expected answer.

# Sample Input 0

# 15 2
# Sample Output 0

# 15 13 13

n, k = map(int, input().split())
#left shift 1 by k bits
print(n | (1<<(k-1)), n & ~(1<<(k-1)), n ^ (1<<(k-1)))


#TC : O(1)
#SC : O(1)
#Output : 15 13 13
#Explanation :
# The binary representation of 15 is 1111.
# Shifting 1 to the left by 1 bit gives us 2.
# The binary representation of 2 is 0010.
# Setting the 2nd bit of 15 gives us 1111 | 0010 = 1111 = 15.
# Clearing the 2nd bit of 15 gives us 1111 & ~0010 = 1101 = 13.
# Toggling the 2nd bit of 15 gives us 1111 ^ 0010 = 1101 = 13. 

