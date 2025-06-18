import sys

input = sys.stdin.readline

n = int(input())
numbers = input().strip()

total = 0

# num은 문자열임
for num in numbers:
    total += int(num)
print(total)
  