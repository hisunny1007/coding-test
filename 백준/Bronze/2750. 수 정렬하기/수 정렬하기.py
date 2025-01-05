#2750번 수 정렬하기 https://www.acmicpc.net/problem/2750

N = int(input())
numbers = [int(input()) for _ in range(N)] 

numbers.sort()

for number in numbers:
  print(number)