import sys
input = sys.stdin.readline

N = int(input())

words = [input().rstrip() for _ in range(N)]    # 주어지는 단어 받아서 리스트에 담기

words = list(set(words))                        # list => set => list로 형변환하여 중복 제거
words.sort(key = lambda x : (len(x), x))             # 단어 길이순 정렬(우선순위 1순위)

for word in words:
    print(word)