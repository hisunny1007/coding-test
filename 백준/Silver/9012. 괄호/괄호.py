import sys

input = sys.stdin.readline

t = int(input())


# 테스트케이스만큼 반복
for _ in range(t):
  ps = input()

  stack = [] # 테스트케이스마다 새로운 stack을 만들어줘야 함

  # ps 입력을 하나하나 돌면서
  for ch in ps:
    if ch == "(":
      stack.append(ch)
    elif ch == ")":
      if stack: # 스택이 비어있지 않다면
        stack.pop()
      else: # 스택이 비어있으면 한 쌍이 아니니까!
        print("NO")
        break # for문을 돌면서 break를 한번이라도 만나면 else 실행 안 함
  
  # for문을 싹다 돌고, (돌 때 break 안 만나고 성공적으로 for문 다 돌았을때)
  # else 실행됨
  # 파이썬 for~else 구문 문법 공부하자;;...
  # break 안 만났을 때
  # 스택이 비어있지 않다면
  else:
    if stack:
      print("NO")
    else: # 모든 과정 다 돌고나서 비어있다면? () 한 쌍끼리 다 나간 거임
      print("YES")
  
  # ( => push (
  # ) => pop