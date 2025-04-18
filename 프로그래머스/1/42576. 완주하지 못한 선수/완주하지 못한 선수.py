def solution(participant, completion):
    
    answer = {}
    
    for p in participant:
        if p in answer:
            answer[p] += 1
        else:
            answer[p] = 1
    
    for c in completion:
        if c in answer:
            answer[c] -= 1
            
    # return answer {"leo":1,"kiki":0,"eden":0}
    for key, value in answer.items():
        if value == 1:
            return key
        
        