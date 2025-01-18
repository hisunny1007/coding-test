N, X = map(int,input().split())

A = list(map(int,input().split()))

answer = []

for el in A:
  if el < X:
    answer.append(el)
print(*answer)