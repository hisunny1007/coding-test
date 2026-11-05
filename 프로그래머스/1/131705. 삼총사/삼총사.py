# 여러 원소 중 순서 상관없이 몇 개를 뽑음 -> 조합
from itertools import combinations

def solution(number):
    answer = 0
    
    # combinations(number, 3) : number에서 서로 다른 위치의 원소 3개를 뽑는 모든 조합
    for a, b, c in combinations(number, 3):
        if a + b + c == 0:
            answer += 1
    
    return answer