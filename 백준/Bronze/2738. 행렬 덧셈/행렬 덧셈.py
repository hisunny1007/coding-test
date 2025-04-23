import sys

input = sys.stdin.readline


n, m = map(int, input().split())

# matrix1 = []

# for _ in range(n):
#   line = list(map(int, input().split()))
#   matrix1.append(line)
# print(matrix1)

# 이걸 리스트 컴프리헨션으로
matrix1 = [list(map(int, input().split())) for _ in range(n)]
matrix2 = [list(map(int, input().split())) for _ in range(n)]

for i in range(n):
  for j in range(m):
    matrix1[i][j] += matrix2[i][j]
# print(matrix1) # [[4, 4, 4], [6, 6, 6], [5, 6, 100]]

for line in matrix1:
    # print(line)
    '''
    [4, 4, 4]
    [6, 6, 6]
    [5, 6, 100]
    '''
    print(*line)