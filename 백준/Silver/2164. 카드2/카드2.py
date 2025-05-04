import sys

input = sys.stdin.readline


from collections import deque

n = int(input())

queue = deque(range(1, n + 1))
# queue = deque([1, 2, 3, 4, 5, 6])

while len(queue) > 1:
  queue.popleft()
  queue.append(queue.popleft())

# print(queue) # deque([4])
print(queue[0])