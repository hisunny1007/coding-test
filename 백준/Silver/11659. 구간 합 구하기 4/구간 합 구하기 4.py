import sys
input = sys.stdin.readline

from itertools import accumulate

N, M = map(int,input().split())
nums = list(map(int,input().split()))

# 누적합 구하기
acc = [0] + list(accumulate(nums))

for _ in range(M):
  i, j = map(int,input().split())
  answer = acc[j] - acc[i-1]
  print(answer)