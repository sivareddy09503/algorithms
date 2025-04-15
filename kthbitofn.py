# Given two integers N and K, write a program to print Kth bit of N.

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

# 1

a, b = map(int,input().split())

if((a & (1<<(b-1)))==0):
    print(0)
else:
    print(1)


#TC : O(1)
#SC : O(1)
#Output : 1
#Explanation :
# The binary representation of 15 is 1111.
# Shifting 1 to the left by 1 bit gives us 2.
# Anding 15 with 2 gives us 1111 & 0010 = 0010 = 2.
# The result is not equal to 0, hence the Kth bit of N is 1.
