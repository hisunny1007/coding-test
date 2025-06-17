import sys

for line in sys.stdin: # 표준 입력에서 한 줄씩 끝날 때까지 읽음
    a, b = map(int, line.split()) # 입력된 한 줄을 공백 기준으로 쪼갬
    if a == 0 and b == 0:
        continue
    print(a + b)
    