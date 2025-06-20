# 백준 사이클 게임 https://www.acmicpc.net/problem/20040

import sys

input = sys.stdin.readline


def find(x):
    if x != parent[x]:
        parent[x] = find(parent[x])
    return parent[x]

def union(x, y):
    x_root = find(x)
    y_root = find(y)
    
    if x_root == y_root:
        return
    
    if x_root < y_root:
        parent[y_root] = x_root
    else:
        parent[x_root] = y_root


n, m = map(int, input().split())
parent = list(range(n)) # 0부터 n-1까지

for i in range(m):
    a, b = map(int, input().split())

    if find(a) == find(b): # 사이클 발생
        print(i + 1)
        break # 바로 종료 (사이클이 생긴 순간 바로 출력하고 종료함)
    else:
        union(a, b)
else:
    print(0)
        
#for 요소 in 반복가능한_것:
#    if 어떤_조건:
#       break
#else:
    # break가 한 번도 실행되지 않았을 때만 이 블록 실행됨
# for-else는 break가 실행되지 않을 때만 else 블록이 실행되는 파이썬만의 문법!
# 👉 반복 중간에 중단된 건지, 끝까지 다 돈 건지를 구분할 수 있어요.
    