import sys

input = sys.stdin.readline

n = int(input())
cards = list(map(int, input().split()))
m = int(input())
numbers = list(map(int, input().split()))

counts = {}

for card in cards:
    if card in counts:
        counts[card] += 1
    else:
        counts[card] = 1

for number in numbers:
    print(counts.get(number, 0), end=" ")