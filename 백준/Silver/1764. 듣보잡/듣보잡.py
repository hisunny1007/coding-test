import sys

input = sys.stdin.readline

n, m = map(int, input().split())
result = {}

for _ in range(n + m):
  name = input().rstrip() # 개행

  if name in result:
    result[name] += 1
  else:
    result[name] = 1
# print(result) # {'ohhenrie': 2, 'charlie': 1, 'baesangwook': 2, 'obama': 1, 'clinton': 1}

answer = []

for name in result:
  if result[name] == 2:
    answer.append(name)

# print(answer) # ['ohhenrie', 'baesangwook']

answer.sort()
# print(answer) # ['baesangwook', 'ohhenrie']
print(len(answer)) # 2
print(*answer, sep="\n")
# baesangwook
# ohhenrie