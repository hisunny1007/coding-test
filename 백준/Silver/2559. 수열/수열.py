import sys
input = sys.stdin.readline

N, K = map(int, input().split())

temps = list(map(int, input().split()))

# 초기값 설정
cnt = sum(temps[:K])
ans = cnt

# 슬라이딩 윈도우
for i in range(N-K):
    cnt += temps[i+K] - temps[i]
    ans = max(ans, cnt)

print(ans)