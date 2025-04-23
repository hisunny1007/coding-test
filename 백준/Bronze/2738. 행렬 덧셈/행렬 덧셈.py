import sys

input = sys.stdin.readline

n, m = map(int, input().split())

matrix = [list(map(int, input().split())) for _ in range(n)]

for i in range(n):
   line = list(map(int, input().split()))
   for j in range(m):
      matrix[i][j] += line[j]

for i in range(n):
   print(*matrix[i])