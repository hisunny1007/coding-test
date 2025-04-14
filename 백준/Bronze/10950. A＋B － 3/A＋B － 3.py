import sys

input = sys.stdin.readline

t = int(input())

for _ in range(t):
    a, b = map(int, input().split())  # .split 문자열을 공백으로 나눠서 각각의 원소에 int 먹이고 다중할당해줌
    print(a + b)