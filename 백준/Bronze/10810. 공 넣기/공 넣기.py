# 바구니 수 N, 공 넣을 범위 M번
N, M = map(int,input().split()) 

# 처음에 공이 없으니까 바구니 배열을 모두 0으로 초기화
baskets = [0] * N 
# print(baskets) [0, 0, 0, 0, 0]

# baskets[0] = 1번바구니
# baskets[1] = 2번바구니
# baskets[2] = 3번바구니
# baskets[3] = 4번바구니
# baskets[4] = 5번바구니

# 공 넣기 M번 반복
for _ in range(M):
  # i번 바구니부터 j번 바구니까지
  i, j, k = map(int,input().split()) 

  # i부터 j까지 범위에 k 번호의 공 넣기
  for index in range(i-1, j): # i-1부터 j-1까지 반복
    baskets[index] = k

print(*baskets)
