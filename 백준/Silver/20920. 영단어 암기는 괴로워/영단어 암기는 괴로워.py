import sys

input = sys.stdin.readline

from collections import Counter

n, m = map(int, input().split())
word_book = {}

for _ in range(n):
  word = input().rstrip()
  if len(word) >= m:
    if word in word_book:
      word_book[word] += 1
    else:
      word_book[word] = 1

answer = sorted(word_book, key=lambda x: (-word_book[x], -len(x), x))
# print(answer) # ['sand', 'apple', 'append']
print(*answer,sep="\n")