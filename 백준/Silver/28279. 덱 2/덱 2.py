from collections import deque

import sys

input = sys.stdin.readline

n = int(input())

dq = deque()

for _ in range(n):
  command = input().rstrip()

  if command == "3":
    print(dq.popleft() if dq else -1)
    continue
  elif command == "4":
    print(dq.pop() if dq else -1)
    continue
  elif command == "5":
    print(len(dq))
    continue
  elif command == "6":
    print(1 if not dq else 0)
    continue
  elif command == "7":
    print(dq[0] if dq else -1)
    continue
  elif command == "8":
    print(dq[-1] if dq else -1)
    continue

  num, x = command.split()
  if num == "1":
    dq.appendleft(int(x))
  elif num == "2":
    dq.append(int(x))

