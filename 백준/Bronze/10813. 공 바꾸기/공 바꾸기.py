N, M = map(int, input().split())


baskets = list(range(1, N + 1))

# baskets = [1, 2, 3, 4, 5]
# baskets[0] = 1
# baskets[1] = 2
# baskets[2] = 3
# baskets[3] = 4
# baskets[4] = 5

for _ in range(M):
  i, j = map(int, input().split())

  baskets[i-1], baskets[j-1] = baskets[j-1], baskets[i-1]

print(*baskets)