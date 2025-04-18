import sys

input = sys.stdin.readline

n = int(input())
now_working = set()

for _ in range(n):
  name, history = input().split()
  
  if history == 'enter':
    now_working.add(name)
  elif history == "leave":
    now_working.remove(name)

# 역순으로
result = sorted(now_working, reverse=True)
# print(result) ['Askar', 'Artem'] 
print(*result, sep="\n") # 언패킹, 개행하자