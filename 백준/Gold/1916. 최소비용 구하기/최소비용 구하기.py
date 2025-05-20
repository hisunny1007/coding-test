import sys

input = sys.stdin.readline

def dijkstra(start):
  distance[start] = 0 # 출발 정점은 거리 0으로 초기화

  for _ in range(n - 1): # n-1개의 정점만 탐색해도 n번째 정점까지의 최단 경로가 도출됨
    # 1. 최단 거리가 확정되지 않은 정점들 중 가장 짧은 경로의 정점 선택
    node, min_dist = -1, INF

    for i in range(1, n + 1):
      if not visited[i] and distance[i] < min_dist:
        node = i
        min_dist = distance[i]

    # 2. 해당 정점에 대한 최단 거리 확정
    visited[node] = True

    if node == end:
      return  # end 정점의 최단 거리가 확정되면 종료

    # 3. 해당 정점과 인접한 정점들에 대한 최단 경로 갱신
    for next_node, dist in graph[node]:
      next_dist = distance[node] + dist

      if not visited[next_node] and next_dist < distance[next_node]:
        distance[next_node] = next_dist



n = int(input())
m = int(input())

# 도시는 1번부터 n번까지
graph = [[] for _ in range(n + 1)]

for _ in range(m):
  s, e, w = map(int, input().split())
  graph[s].append((e, w))

INF = float("inf") 
distance = [INF] * (n + 1) # 1. distance를 무한대로 모두 초기화

# 최단 경로 확정을 위한 방문 리스트
visited = [False] * (n + 1) # 2. visited를 False로 모두 초기화 (최단거리 확정된 곳이 없음)


start, end = map(int, input().split())

dijkstra(start)

print(distance[end])
