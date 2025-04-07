# A group of N players want to elect a team leader. They each wear a uniform with a distinct ID, and the IDs are in the range of 1 to N.

# They decided to use paper ballot to vote for the leader. Each voter writes the ID of a candidate on a ballot and places it in the ballot box. The candidate with the highest number of votes becomes the leader. If two or more candidates have the same number of votes, then the candidate with larger ID will be elected as leader.

# Given a sequence A of IDs voted by N players, your task is to find the leader ID.

# Input Format

# First line consists of T - the number of testcases.
# T testcases follow. First line of each test case contains N. Second line of each testcase contains N space separated integers.
# Constraints

# 1 <= T <= 50
# 1 <= N <= 10^5
# 1 <= A[i] <= N (i <= 0 < N)
# Output Format

# For each testcase, output a line with an expected answer.

# Sample Input 0

# 2
# 4
# 1 1 2 2
# 10
# 10 8 2 5 7 1 3 9 4 6
# Sample Output 0

# 2
# 10
def teamLead(arr):
    n = len(arr) 
    x = [0]*(n+1)
    for i in range(n):
        x[arr[i]] += 1
    votes = 0 
    res = 0
    for i in range(1,n+1):
        if(x[i]>votes or(x[i]==votes and i>res)):
            votes =x[i]
            res = i
    print(res)
t = int(input())
for _ in range(t):
    n = int(input())
    arr = [int(x) for x in input().split()]
    teamLead(arr)
    
#TC:O(n)
#SC:O(n)