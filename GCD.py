# Given two integers A and B, your task is to compute the GCD of those numbers without using gcd library function.

# Input Format

# First line consists of number of testcases T.
# T testcases follow. Each testcase consists of two numbers A and B in a line.
# Constraints

# 1 <= T <= 10^5
# 1 <= A, B <= 10^18
# Output Format

# For each testcase, output a line with an expected answer.

# Sample Input 0

# 3
# 10 15
# 12 20
# 50 100
# Sample Output 0

# 5
# 4
# 50

#Using recursion
def gcd(n,m):
    if(n==m):
        return n
    if(n>m):
        return gcd(n-m,m)
    else:
        return gcd(n,m-n)
#Using iterative approach - subtraction
def gcd1(n,m):
    while(n!=m):
        if(n>m):
            n = n-m
        else:
            m = m-n
    return n
#Using iterative approach - division
def gcd2(n,m):
    while(n!=0 and m!=0):
        if(n>m):
            n = n%m
        else:
            m = m%n
    return m if n==0 else n
    
t = int(input())
for _ in range(t):
    n, m = map(int,input().split())
    res = gcd2(n,m)
    print(res)

#TC : O(log(min(a,b)))
#SC : O(1)
#GCD means Greatest Common Divisor.
#It is the largest number that divides both a and b.
#For example, GCD of 10 and 15 is 5.
#GCD is useful in encrypting data, finding LCM, and reducing fractions.
#It is also used in number theory and cryptography.
#GCD in cryptography like RSA algorithm is used to encrypt and decrypt data.
#RSA algorithm with GCD example:
#1. Choose two large prime numbers p and q.
#2. Calculate n = p * q.
#3. Calculate phi(n) = (p-1)(q-1).
#4. Choose a public exponent e such that 1 < e < phi(n) and gcd(e, phi(n)) = 1.
#5. Calculate the private exponent d such that d * e mod phi(n) = 1.
#6. The public key is (e, n) and the private key is (d, n).
#7. To encrypt a message m, calculate c = m^e mod n.
#8. To decrypt the ciphertext c, calculate m = c^d mod n.
#9. The GCD is used to ensure that e and phi(n) are coprime, which is necessary for the RSA algorithm to work correctly.
#10. The GCD is also used to calculate the modular inverse of e, which is needed to find the private key d.
#11. The GCD is a fundamental concept in number theory and is used in many cryptographic algorithms.

