def solution(k, m, score):
    answer = 0
    score.sort(reverse=True)
    
    # 한 상자에 m개씩 담기니까 간격은 m
    for i in range(0, len(score), m):
        box = score[i:i+m]
        
        if len(box) == m:
            answer += min(box) * m
            
    return answer
        