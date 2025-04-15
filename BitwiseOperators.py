# After much effort, humanity and the residents of Pandora have achieved peace. During their interactions, the Pandora residents have expressed interest in learning about bitwise operators.

# Given two integers A and B, can you provide the AND, OR, and XOR results for the integers A and B ?

# Input Format

# Single line consisting of A and B.

# Constraints

# 1 <= A, B <= 10^4

# Output Format

# Output a line that consists of AND, OR, XOR of A and B.

# Sample Input 0

# 5 3
# Sample Output 0

# 1 7 6
# Explanation 0

# Here A = 5 , B = 3.

# A & B = 1

# A | B = 7

# A ^ B = 6

a, b = map(int, input().split())
print(a & b, a | b, a^b)


#TC : O(1)
#SC : O(1)
#Output : 1 7 6
