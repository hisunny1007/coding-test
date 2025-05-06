# 백준 바이러스 https://www.acmicpc.net/problem/2606

import sys

input = sys.stdin.readline

n = int(input()) # 정점 개수
m = int(input()) # 간선 개수
graph = [[] for _ in range(n + 1)] # 1~7 정점있음

for _ in range(m):
  v1, v2 = map(int, input().split())
  graph[v1].append(v2)
  graph[v2].append(v1)


visited = [False] * (n + 1)


def dfs(node):
  for next_node in graph[node]:
    if not visited[next_node]:
      visited[next_node] = True
      dfs(next_node)

visited[1] = True
dfs(1)

# print(visited) [False, True, True, True, False, True, True, False]
# 1번 컴퓨터를 통해 걸리는 컴퓨터 수
print(sum(visited)- 1) # 1번 컴퓨터 제외하기