## 백준 외판원 순회 2 https://www.acmicpc.net/problem/10971

# 한붓그리기 / 해밀턴경로
# 이미 한번 갔던 도시로는 갈 수 없다

# 인접한 도시 간의 비용을 나타내는 일종의 인접행렬 w

# 1 ~ N개 중 N개 뽑는 것 => 순열
# 브루트포스 -> 순열 : 시간복잡도 O(n!)

import sys

input = sys.stdin.readline

# [1,2,3,4] 인지 [1,2,4,3] 인지 내가 몰라도 돼 / n개 도시 모두 방문했다는 것만 중요함
  # 다시 출발 정점으로 돌아와야 함 => 돌아올 수 있는지도 판단해야 돼

# city: 현재 내가 몇 번째 도시인지에 대한 도시 번호
# depth: 현재 내가 몇 개의 도시를 탐색했는지 그 깊이
# cost: 현재 도시까지 왔을 때의 총 비용
def permutations(city, depth, cost):
  # 1. 종료조건
  # 출발 노드로 돌아오기 직전이면서, 출발 노드로 갈 수 있는 경우라면
  if depth == n - 1 and w[city][0] > 0: # 모든 정점을 한번씩 가봤고 현재 내가 마지막 도시에서 출발 도시까지 가는 비용이 0보다 크면(=가는 길이 있음)
    global min_cost
    min_cost = min(min_cost, cost + w[city][0])


  # 2. 재귀식
  for next_city in range(n):
    if not visited[next_city] and w[city][next_city] > 0:
      visited[next_city] = True
      permutations(next_city, depth + 1, cost + w[city][next_city])

      visited[next_city] = False # 순열이니까 방문 취소 해야 함
      # 경우가 아니라 비용이니까 pop할 필요도 없음

n = int(input())
# w = []
# for _ in range(n):
#   line = list(map(int, input().split()))
#   w.append(line)

w = [list(map(int, input().split())) for _ in range(n)] # 인접행렬

# 순열은 뽑은 거 또 뽑으면 안되기 때문에 방문배열 필요함
visited = [False] * n # 가장 적은 비용만 구하는 거기 때문에 1~n번 -> 0~n-1번으로 해도 돼
min_cost = 10_000_000  # 최악의 상황의 비용: 최대 도시 수(10) * 도시 이동 최대 비용(1_000_000) (정점의 개수만큼 간선을 거침)

visited[0] = True
permutations(0, 0, 0) # city, depth, cost

print(min_cost)