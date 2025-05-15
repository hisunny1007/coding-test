# 백준 집합의 표현 https://www.acmicpc.net/problem/1717

import sys

input = sys.stdin.readline
sys.setrecursionlimit(100000)


def find(x):
  # 1. 종료조건
  # 대표값을 찾을 때까지 (= 나랑 부모랑 같을 때까지)
  if x == parent[x]:
    return parent[x]
  
  # 2. 재귀식
  parent[x] = find(parent[x]) # 경로압축
  # 나랑 위랑 같을 때까지 반복함 
  # x != parent[x]: # 한 칸 올라감. 그럼 x=parent[x]가 됨. 한칸 올라간 parent[x]를 넘겨서 계속 올라감.ㄴ
  return parent[x]

def union(x, y):
  x_root = find(x) # x가 속한 집합
  y_root = find(y) # y가 속한 집합

  if x_root == y_root:
    return
  
  if x_root < y_root:
    parent[y_root] = x_root
  else:
    parent[x_root] = y_root

n, m = map(int, input().split())
parent = list(range(n + 1))

for _ in range(m):
  command, a, b = map(int, input().split())

  if command == 0:
    union(a, b)
  else: # command == 1:
    if find(a) == find(b):
      print("YES")
    else:
      print("NO")

