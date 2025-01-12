import sys
input = sys.stdin.readline

T = int(input())

for _ in range(T):
  results = input()
  current_score = 0 # 현재 연속된 0의 점수
  total_score = 0 # 총 점수
  
  for result in results:
    if result == "O": # 맞았으면
      current_score += 1 # 현재 점수 1 증가
      total_score += current_score # 총 점수에 추가

    elif result == "X": # 틀렸으면
      current_score = 0 # 현재 점수 초기화
  print(total_score)