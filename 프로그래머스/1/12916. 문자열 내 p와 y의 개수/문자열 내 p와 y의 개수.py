def solution(s):
    answer = True
    
    p_cnt = 0
    y_cnt = 0
    
    # 대문자 or 소문자로 변경
    for ch in s.lower():
        if ch == 'p':
            p_cnt += 1
        elif ch == 'y':
            y_cnt += 1
            
    return p_cnt == y_cnt # 같으면 true 다르면 false (p,y가 하나도 없으면 둘다 0이므로 자동으로 true 리턴)

    return True