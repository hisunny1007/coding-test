# 체스판 따로 저장해서 나중에 쓰는 게 아니기 때문에 굳이 만들 필요 없음
# 입력 한 줄씩 읽고 바로 처리하기 때문에 입력만 잘 받음 돼
# chesspan = [[0] * 8 for _ in range(8)]

# 하얀칸 (0,0) (0,2), (0,4) (0,6)
# (1,1) (1,3)...
count = 0

for i in range(8):
    chess = input()

    for j in range(8):
      if (i + j) % 2 == 0: # 하얀칸
        if chess[j] == "F":
          count += 1

print(count)