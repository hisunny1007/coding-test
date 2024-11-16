T = int(input())

for _ in range(T):
  idx, word = input().split()
  idx = int(idx)
  ans = word[:idx-1] + word[idx:]
  print(ans)


# idx = 4
# m i s (s) p e l l 
# 0 1 2  3  4 5 6 7
# [:idx-1] + [idx:]
