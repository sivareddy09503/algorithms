# A standard deviation is a measure of how dispersed the data is in relation to the mean. Given a sequenc of N numbers, your task is to compute the standard deviation of those numbers. The SD is defined as the square root of, the sum of the squared differences between each element and the mean divided by the number of elements.

# Input Format

# The first line contains a number N, where N is the number of elements.

# The next line contains N numbers, the elements of the group, separated by space between elements.

# Constraints

# 1 <= N <= 10^4

# 10^-9 <= each element <= 10^9

# Output Format

# Output a single line contains single number, the standard deviation, rounded to 2 decimal places.

# Sample Input 0

# 6
# 10 8 10 8 8 4
# Sample Output 0

# 2.00

import math
def std(arr,n):
    sum = 0
    for i in range(n):
        sum += arr[i]
    mean = sum/n
    std = 0
    for i in range(n):
        std += pow(((arr[i]-mean)),2)
    std_num = math.sqrt(std/n)
    print(f"{std_num:.2f}")

n = int(input())
arr = [int(x) for x in input().split()]
std(arr,n)