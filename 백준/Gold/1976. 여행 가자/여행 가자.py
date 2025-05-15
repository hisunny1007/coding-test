# 백준 여행가자 https://www.acmicpc.net/problem/1976

import sys

input = sys.stdin.readline

n = int(input())
m = int(input())

# matrix = []

# for _ in range(n):
#   line = list(map(int, input().split()))
#   matrix.append(line)

matrix = [list(map(int, input().split())) for _ in range(n)]

parent = list(range(n + 1)) # n까지



def find(x):
  if x != parent[x]:
    parent[x] = find(parent[x])
  return parent[x]


def union(x, y):
  x_root = find(x)
  y_root = find(y)

  if x_root == y_root:
    return
  
  if x_root < y_root:
    parent[y_root] = x_root
  else:
    parent[x_root] = y_root


# 연결돼있으면 union으로 합치기 
for i in range(n):
  for j in range(n):
    if matrix[i][j] == 1:
      union(i + 1, j + 1) # 1부터 시작함

# 여행 계획 도시들 같은 집합임?
plan = list(map(int, input().split()))

# 첫 번째 도시 집합 확인하고 같은지 비교

first_city = find(plan[0])

# for city in plan:
#   if find(city) == first_city:
#     print("YES")
#   else:
#     print("NO")

possible = all(find(city) == first_city for city in plan)

print("YES" if possible else "NO")