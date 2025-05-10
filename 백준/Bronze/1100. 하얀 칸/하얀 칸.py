import sys
input = sys.stdin.readline

board = [input().rstrip() for _ in range(8)]
total = 0

for i in range(8):
    for j in range(8):
        if i % 2 == j % 2 and board[i][j] == "F":
            total += 1

print(total)