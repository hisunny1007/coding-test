# def solution(arr):
    
#     arr.sort(reverse=True)
    
#     if len(arr) != 1:
#         arr.pop()
#     elif len(arr) == 1:
#         return [-1]
    
#     return arr

def solution(arr):
    arr.remove(min(arr))
    
    if not arr:
        return [-1]
    
    return arr