str = input()

for i in str:
    # 대문자인가?
    if i.isupper() == True:
        print(i.lower(), end="")
    # 소문자인가?
    # elif i.islower() == True:
    else:
        print(i.upper(), end="")


# swapcase() 파이썬 내장 함수 : 대소문자 바꾸기
# print(str.swapcase())

