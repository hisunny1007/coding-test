import sys

input = sys.stdin.readline

n, m = map(int, input().split())
s = set() # 집합 만듬

for _ in range(n):
  word = input().rstrip()
  s.add(word)
# print(s) {'startlink', 'sundaycoding', 'codeplus', 'baekjoononlinejudge', 'codingsh'}

count = 0

for _ in range(m):
  word = input().rstrip()
  if word in s:
    count += 1

print(count)