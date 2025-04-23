# 백준 색종이 https://www.acmicpc.net/problem/2563
# 오후 8시 15분 -> 9시 15분

# 가로100, 세로100 - 흰 도화지
# 가로10, 세로10 -검은 색종이  3장 붙임

import sys

input = sys.stdin.readline

n = int(input()) # 색종이 개수

# paper = []

# for _ in range(100): # 가로 100 
#     paper.append([0] * 100) # 세로 100

# 리스트 컴프리헨션 => 2차원 리스트 간단하게 초기화 가능
paper = [[0] * 100 for _ in range(100)]

# 색종이 1 (3, 7) -> (13, 17) 지금 붙은 자리 : 여기는 싹다 있음  # 미만이어야됨!
# 색종이 2 (15, 7) -> (25, 17)
# 색종이 3 (5, 2) -> (15, 12)
for _ in range(n):
  x, y = map(int, input().split()) # 색종이 위치 좌표 (행, 열로 표시)
  for i in range(x, x+10): # 미만이어서 +10임 (3,7) ~ (12, 16) 범위
    for j in range(y, y+10): 
      # paper[i][j] += 1
      # 아 이렇게하면 중복되면 숫자 커짐..
      paper[i][j] = 1

count = 0

for i in range(100):
  for j in range(100):
    if paper[i][j] == 1:
      count += 1
print(count)