def solution(participant, completion):
    
    # 몇 번 나왔는지 세는 딕셔너리
    counts = {}
    
    # 참가자 이름별 인원수 +1
    for name in participant:
        counts[name] = counts.get(name, 0) + 1
        
    # 완주자 이름에 있으면 -1
    for name in completion:
        counts[name] = counts.get(name, 0) - 1
    
    # value값이 0이 아니면 완주 못한 사람임
    for name in counts:
        if counts[name] != 0:
            return name
        