from collections import deque

t = int(input())

for tc in range(1, t + 1):
    n, m = map(int, input().split())
    q = deque(map(int, input().split()))

    # m번 회전
    for _ in range(m):
        q.append(q.popleft())  # 맨 앞 숫자를 맨 뒤로

    print(f"#{tc} {q[0]}")