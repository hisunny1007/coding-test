def is_win(cnt):
    """
    현재 카운팅 배열이 triplet 또는 run을 포함하면 True 반환
    """
    # triplet 검사: 어떤 숫자가 3개 이상이면 승리
    for i in range(10):
        if cnt[i] >= 3:
            return True
    
    # run 검사: 연속된 세 숫자(i, i+1, i+2)가 모두 존재하면 승리
    for i in range(8):  # 0~7까지 (i+2가 9를 넘지 않도록)
        if cnt[i] > 0 and cnt[i+1] > 0 and cnt[i+2] > 0:
            return True
    
    return False


# 메인 실행부
t = int(input())  # 테스트 케이스 개수

for tc in range(1, t + 1):
    # 카드배열 입력받기 (한 줄에 12개 숫자)
    arr = list(map(int, input().split()))
    
    # 카운팅 배열 만들기 (길이 10짜리 배열로 숫자별 보유 개수 셈)
    # p1[3] == 2이면 플레이어1이 숫자3을 두 장 가지고 있음
    p1 = [0] * 10  # 플레이어1의 카드 카운트(0~9)
    p2 = [0] * 10  # 플레이어2의 카드 카운트(0~9)
    result = 0     # 결과: 0 = 무승부, 1 = p1 승, 2 = p2 승
    
    for i in range(12):
        card = arr[i]
        
        if i % 2 == 0:  # 짝수 인덱스는 player1 카드 (0인덱스부터 시작이니까)
            p1[card] += 1  # 해당 숫자 카운트 증가
            
            if is_win(p1):  # 뽑자마자 판정
                result = 1
                break  # 즉시승리 -> 더이상 진행x
                
        else:  # 홀수 인덱스는 player2카드
            p2[card] += 1
            
            if is_win(p2):
                result = 2
                break
    
    print(f"#{tc} {result}")