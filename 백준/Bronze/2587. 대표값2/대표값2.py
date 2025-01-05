numbers = [int(input()) for _ in range(5)]

# print(numbers)
avg = sum(numbers) // 5
numbers.sort()
median = numbers[2]

print(avg)
print(median)