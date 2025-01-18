numbers = list(int(input()) for _ in range(9))

max_num = -float("INF")
for number in numbers:
  if number > max_num:
    max_num = number
print(max_num)
print(numbers.index(max_num)+1)