-- 코드를 입력하세요
# SELECT COUNT(*) AS USERS
# FROM USER_INFO
# WHERE AGE IS NULL

# CASE로 푸는 방법 연습하기
# 나이 없으면 1 -> 1만 더해서 개수 계산
SELECT 
    SUM(
        CASE 
            WHEN AGE IS NULL THEN 1 
            ELSE 0 
        END
    ) AS USERS
FROM USER_INFO;
