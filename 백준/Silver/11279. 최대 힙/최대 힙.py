import sys
from heapq import heappop, heappush

input = sys.stdin.readline

heap = []

for _ in range(int(input())):
    x = int(input())

    if x == 0:
        print(-heappop(heap) if heap else 0)  # 꺼낼 때는 다시 양수로 복원
    else:
        heappush(heap, -x)  # 넣을 때는 음수로 변환