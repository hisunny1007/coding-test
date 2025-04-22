import sys

input = sys.stdin.readline

n, m = map(int, input().split())
a = []
b = []

for _ in range(n):
    line = list(map(int, input().split()))
    a.append(line)
# print(a) # [[1, 1, 1], [2, 2, 2], [0, 1, 0]]


for _ in range(n):
    line = list(map(int, input().split()))
    b.append(line)
# print(b) # [[3, 3, 3], [4, 4, 4], [5, 5, 100]]

for i in range(n):
    for j in range(m):
        answer = a[i][j] + b[i][j]
        # print(answer)
        # 4
        # 4
        # 4
        # 6
        # 6
        # 6
        # 5
        # 6
        # 100
        print(answer, end = " ") # 4 4 4 6 6 6 5 6 100
    print()