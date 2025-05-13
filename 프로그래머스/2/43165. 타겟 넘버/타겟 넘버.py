def solution(numbers, target):
    
    def dfs(depth, total):
        # 1. 종료 조건
        if depth == len(numbers):
            # 끝까지 왔으면, 현재까지의 합과 타겟 넘버를 비교
            if total == target:
                nonlocal answer
                answer += 1
            return
        
        # 2. 점화식 (재귀식)
        dfs(depth + 1, total + numbers[depth]) # 숫자를 더하는 경우
        dfs(depth + 1, total - numbers[depth]) # 숫자를 빼는 경우
        
    answer = 0
    dfs(0, 0)
    
    return answer