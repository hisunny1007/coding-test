T = int(input())

# 여러 테스트 케이스를 처리하려면 T만큼 반복
for _ in range(T):
# 3 ABC 숫자랑 문자열 같이 있으니까 따로 나눠야함
  R, S = input().split() #['3', 'ABC']
# split() 메서드가 문자열을 공백 기준으로 나누어 리스트를 반환
# R = '3' , S = 'ABC'
  R = int(R)

  for char in S: #문자열 S의 각 문자를 순회
    print(char * R, end="")
  print()
