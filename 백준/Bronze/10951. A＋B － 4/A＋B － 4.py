# 입력이 몇 줄인지 알 수 없음 -> EOF(End Of File) 처리 
# 어느 타이밍에 입력이 끝나는지를 파악하는 코드가 필요
# 파이썬에서 EOF까지 입력을 처리하려면 보통 try-except 또는 sys.stdin 사용

# input()은 입력 개수가 정해져 있을 때만 유효
# sys.stdin은 파일 끝까지 자동으로 반복하며 읽을 수 있음

import sys

for line in sys.stdin: # 표준 입력에서 한 줄씩 끝날 때까지 읽음
    a, b = map(int, line.split()) # 입력된 한 줄을 공백 기준으로 쪼갬
    print(a + b)