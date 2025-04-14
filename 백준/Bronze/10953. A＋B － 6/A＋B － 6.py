import sys

input = sys.stdin.readline

t = int(input())

# split 기본적으로 구분자는 공백, 개행임
# split 안에 구분자를 직접 추가할 수 있음 ","

for _ in range(t):
  a, b = map(int, input().split(","))
  print(a + b)