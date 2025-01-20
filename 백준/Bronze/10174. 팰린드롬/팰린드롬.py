n = int(input())

for _ in range(n):
  words = input()
  words = words.lower() # 입력된 문자열을 소문자로 변환


  if words == words[::-1]:
    print("Yes")
  else:
    print("No")