def solution(board, moves):
    
    stack = []
    answer = 0
    
    # 각 열 나타냄
    for move in moves:
        col = move -1 # 인덱스는 0부터 시작하니까 1 빼줘야 함
    
    # range(5) : 0, 1, 2, 3, 4
        for row in range(len(board)):
            if board[row][col] != 0: # 비어있지 않으면(인형 있으면)
                doll = board[row][col]
                board[row][col] = 0

                if stack and stack[-1] == doll: # 맨 위에 있는게 같은 인형이라면
                    stack.pop()
                    answer += 2
                else:
                    stack.append(doll)
                break
                
    return answer
    