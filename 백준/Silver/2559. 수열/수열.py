import sys
input = sys.stdin.readline

N, K = map(int, input().split())

temps = list(map(int, input().split()))

# 누적합 리스트 제작
acc = [0]
for temp in temps:
    acc.append(acc[-1]+temp)

ans = -987654321
for i in range(N-K+1):
    tmp = acc[i+K] - acc[i]
    ans = max(ans, tmp)

print(ans)