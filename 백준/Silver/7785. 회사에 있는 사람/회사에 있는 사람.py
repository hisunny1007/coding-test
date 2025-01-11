import sys
input = sys.stdin.readline

n = int(input())
answer = set()

for _ in range(n):
  name, status = input().split()

  if status == "enter":
    answer.add(name)
  elif status == "leave":
    answer.discard(name)

answer2 = sorted(answer, reverse=True)

for person in answer2:
  print(person)