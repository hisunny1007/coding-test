import sys

input = sys.stdin.readline

n = int(input())
numbers = []

for _ in range(n):
  number = int(input())
  numbers.append(number)

numbers.sort()
print(*numbers, sep="\n")