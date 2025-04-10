# You are given 7 numbers and need to find five of them whose sum is 100.

# Input Format

# The input has one line, which contains 7 numbers.

# Constraints

# Each number is between 1 and 99, inclusive.

# It is guaranteed that at most one solution exists.

# Output Format

# If there exist 5 numbers in the given 7 that sum to 100, output one line that has 5 numbers, separated by a single space. The order should be the same as the number appears in their original(show-up) order.

# Otherwise, output "No solution exists!"

# Sample Input 0

# 11 8 10 12 19 29 33
# Sample Output 0

# 11 8 19 29 33


def quintupleSum(arr):
    n = len(arr)
    sum = 0 
    exist = False
    for i in range(n):
        for j in range(i+1,n):
            for k in range(j+1,n):
                for l in range(k+1,n):
                    for m in range(l+1,n):
                        if(arr[i]+arr[j]+arr[k]+arr[l]+arr[m]==100):
                            print(arr[i], arr[j], arr[k], arr[l], arr[m])
                            exist = True
                            break
                    if(exist):
                        break
                if(exist):
                    break
            if(exist):
                break
        if(exist):
            break
    if not exist:
        print("No solution exists!")

arr = [int(x) for x in input().split()]
quintupleSum(arr)

#TC : O(1)
#SC : O(1)
