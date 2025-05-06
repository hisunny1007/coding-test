# 백준 덱 https://www.acmicpc.net/problem/10866
# 오후 11시 37분


from collections import deque
import sys

input = sys.stdin.readline


n = int(input())

queue = deque()

for _ in range(n):
  order = input().rstrip() # 개행
  
  if order == "front":
    if queue:
      print(queue[0])
    else:
      print(-1)
  elif order == "back":
    if queue:
      print(queue[-1])
    else:
      print(-1)
    continue


  if order == "empty":
    if queue:
      print(0)
    else:
      print(1)
      continue

  if order == "size":
    print(len(queue))
    continue

  if order == "pop_front":
    if queue:
      print(queue.popleft())
    else:
      print(-1)
      continue

  if order == "pop_back":
    if queue:
      print(queue.pop())
    else:
      print(-1)
      continue

  if order.startswith("push"):
    command, x = order.split()
    x = int(x)

    if command == "push_front":
      queue.appendleft(x)
    else:
      queue.append(x)
