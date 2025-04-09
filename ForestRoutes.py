# You are walking through a forest, and keeping track of the coordinates of checkpoints. Eventually, you decide you would like to turn back and go home. Can you remember how to get back?

# Input Format

# The first line of input will be the number of checkpoints C. The next lines will be 2 checkpoint coordinates Cx and Cy. The next line will be the number of queries Q. The next Q lines will be queries in the format of the checkpoint number and the coordinate requested. The checkpoints will be counted starting from 0.

# Constraints

# 1 <= C <= 20

# -10 <= Cx,Cy <= 10

# 1 <= Q <= 20

# Output Format

# For each query, print the value of the coordinate queried.

# Sample Input 0

# 6
# -9 2
# 2 7
# -8 6
# -7 -9
# -8 -3
# -6 0
# 5
# 2 x
# 4 x
# 3 y
# 1 x
# 3 y
# Sample Output 0

# -8
# -8
# -9
# 2
# -9

def routes(pairs,queries):
    n = len(queries)
    query_x = [query[0] for query in queries]
    query_y = [query[1] for query in queries]
    i = 0
    for i in range(len(queries)):
        count = query_x[i]
        b = query_y[i]
        m=0
        for pair in pairs:
            if(count==m):
                if(b=='x'):
                    print(pair[0])
                else:
                    print(pair[1])
            m = m+1

n = int(input())
arr = []
for _ in range(n):
    line = input().split()
    arr.append(int(line[0]))
    arr.append(int(line[1]))
pairs = [(arr[i],arr[i+1]) for i in range(0,len(arr),2)]

m = int(input())
arr1 = []
for _ in range(m):
    line1 = input().split()
    arr1.append(int(line1[0]))
    arr1.append(line1[1])
queries = [(arr1[i],arr1[i+1]) for i in range(0,len(arr1),2)]
routes(pairs,queries)


#TC:O(n*m)
#SC:O(n)

#Optimized
