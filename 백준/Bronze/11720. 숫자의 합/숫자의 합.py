import sys

input = sys.stdin.readline

n = int(input())
# numbers = input().strip()

# total = 0

# # num은 문자열임
#for num in numbers:
#    total += int(num)
#print(total)

# 리스트컴프리헨션 사용
s = input().strip()
#total = 0

#for ch in s:
#    total += int(ch)

total = sum(int(ch) for ch in s)
print(total)

  