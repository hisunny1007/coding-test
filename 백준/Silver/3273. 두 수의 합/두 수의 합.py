import sys
input = sys.stdin.readline

n = int(input())
nums = list(map(int, input().split()))
x = int(input())
nums.sort()                     # 전처리: 정렬

l, r = 0, n-1
ans = 0

while l < r:                    # l과 r이 만나거나 교차하면 종료
    tmp = nums[l] + nums[r]     # 두 포인터가 가리키는 값 더해서

    if tmp == x:                # 일치하면
        ans += 1                # 정답 세주고
        l += 1                  # l포인터 오른쪽 이동
        r -= 1                  # r포인터 왼쪽 이동

    elif tmp > x:               # 너무 크다면
        r -= 1                  # r포인터 왼쪽 이동

    else:                       # 너무 작다면
        l += 1                  # l포인터 오른쪽 이동

print(ans)