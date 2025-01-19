words = list(input())

# 리스트 슬라이싱
# 리스트[start : end : step] start 인덱스 이상, end 인덱스 미만을 step 간격으로 잘라냄
# start 자리 비워두면 처음부터, end 자리 비워두면 끝까지, step 자리에 음수 입력하면 거꾸로 슬라이싱
# print(words[::-1]) // 리스트 뒤집기


if words == words[::-1]:
  print(1)
else:
  print(0)
