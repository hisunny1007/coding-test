def solution(s):
    p_cnt = 0
    y_cnt = 0

    for ch in s.lower():
        if ch == "p":
            p_cnt += 1
        elif ch == "y":
            y_cnt += 1

    return p_cnt == y_cnt