# Q. 총 몇 개의 네트워크(그룹)가 있는지 return

# 서로 연결된 컴퓨터들을 같은 집합(그룹)으로 묶고 
# (묶인 그룹의 수 세기) 그 집합이 총 몇 개인지 세기
# => 유니온 파인드로 연결 해준 다음, 부모가 몇 종류인지 세기
# 유니온은 묶는 것 / 파인드는 대표 찾기 / 네트워크 수는 대표가 몇 종류냐? 문제임

def solution(n, computers):
    
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
    
    # 1. 초기 부모 설정
    parent = list(range(n)) # n - 1까지니까
    
    # 2. 연결 정보로 union
    for i in range(n):
        for j in range(n):
            if computers[i][j] == 1 and i != j:
                union(i, j)
                
    # 3. 네트워크 개수 세기 (최종적으로 각 컴퓨터의 부모 노드 찾기)
    # 마지막에 find() 한 번씩 돌려서 모든 컴퓨터의 진짜 부모 찾고 부모 종류 몇 개인지 세기
    for i in range(n):
        parent[i] = find(i)
        
    # 부모 노드 종류 개수 => 네트워크 개수
    return len(set(parent)) # set() 중복을 제거한 집합 자료형
    
    # parent = [0, 0, 2]
    # set(parent) -> {0, 2}
    
    