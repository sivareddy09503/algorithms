# Given two integers N and M, write a program to compute N * 2^M, N / 2^M using bitwise shift operators only.

# Input Format

# Single line consisting of N and M.

# Constraints

# 1 <= N <= 10^4
# 1 <= M <= 10^2
# Output Format

# Output a line that consists of an expected answer.

# Sample Input 0

# 10 2
# Sample Output 0

# 40 2

a, b = map(int,input().split())
#Bitwise left shift - multiplication by 2
#Bitwise right shift - Divided by 2
print(a << b, a >> b)

#TC : O(1)
#SC : O(1)
#Output : 40 2
