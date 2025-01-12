import sys
input = sys.stdin.readline

N = int(input())
# 구조화
# 빈 딕셔너리 제작
sales_info = {}

# 반복문을 돌며
for _ in range(N):
  # 책 제목 입력받고
  book_title = input()

# 조건문을 통한 분기
  # 만약 딕셔너리에 해당 제목이 없다면? => 생성
  if book_title not in sales_info:
    sales_info[book_title] = 1
  # 있다면? => 1 더해주기
  else:
    sales_info[book_title] += 1

# print(sales_info) // {'top': 4, 'kimtop': 1}

# 딕셔너리 정렬
# print(sales_info.items()) 키-값 쌍 모두 가져오기 [('top', 4) , ('kimtop', 1)]
# 딕셔너리 아이템을 value값의 역순(내림차순), 같다면 key순(오름차순=알파벳순)으로 정렬
sorted_sales_info = sorted(sales_info.items(), key=lambda x: (-x[1], x[0]))
print(sorted_sales_info[0][0])