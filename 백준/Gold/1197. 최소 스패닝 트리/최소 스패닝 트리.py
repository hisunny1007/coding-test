# 백준 최소 스패닝 트리 https://www.acmicpc.net/problem/1197

import sys

input = sys.stdin.readline

v, e = map(int, input().split())


def find(x):
  if x != parent[x]:
    parent[x] = find(parent[x])
  return parent[x]

def union(x, y):
  x_root = find(x)
  y_root = find(y)

  if x_root == y_root: # 같은 집합 => 사이클 있음 => 최소 신장트리 x
    return False
  
  if rank[x_root] > rank[y_root]:
    parent[y_root] = parent[x_root]
  elif rank[x_root] < rank[y_root]:
    parent[x_root] = parent[y_root]
  else:
    parent[x_root] = parent[y_root]
    rank[y_root] += 1
  
  return True


parent = list(range(v + 1))
rank = [0] * (v + 1)

total = 0
counts = 0


edges = []
for _ in range(e):
  line = list(map(int, input().split()))
  edges.append(line)

# 1. 가중치 가장 낮은 거부터 정렬 ! for문 바깥에서! 실수로 안에다 넣어서 시간초과
edges.sort(key=lambda x: x[2]) # c 가중치 정렬

# 가장 작은 비용의 간선부터 차례로 선택
for a, b, c in edges:
  if union(a, b):
    total += c
    counts += 1

    if counts == v - 1:
      break

print(total)


