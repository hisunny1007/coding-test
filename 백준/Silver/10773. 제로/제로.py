import sys

input = sys.stdin.readline

k = int(input())

stack = []
answer = 0

for _ in range(k):
  num = int(input())

  if num != 0:
    stack.append(num)
# print(stack)
  elif num == 0:
    # if stack:
    stack.pop()
    
# print(stack)
for i in stack:
  answer += i
print(answer)      
