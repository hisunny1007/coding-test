n, m = map(int, input().split())
dict = {}

for _ in range(n):
  word = input().rstrip() # 개행 있어서 한줄로 받기 위해 rstrip

  if word in dict:
    dict[word] += 1
  else:
    dict[word] = 1
 
count = 0

for _ in range(m):
  new_word = input().rstrip()

  if new_word in dict:
    count += 1
print(count)