-- 코드를 입력하세요
# 1. 리뷰를 가장 많이 쓴 회원 1명 찾기
# 2. 그 회원이 쓴 모든 리뷰 출력
# 3. 회원 이름, 리뷰 내용, 리뷰 날짜 출력
# 4. 날짜 오름차순, 날짜 같으면 리뷰내용 오름차순 
SELECT P.MEMBER_NAME, R.REVIEW_TEXT,
    DATE_FORMAT(R.REVIEW_DATE, '%Y-%m-%d') AS REVIEW_DATE
FROM MEMBER_PROFILE P
JOIN REST_REVIEW R ON P.MEMBER_ID = R.MEMBER_ID
# 리뷰를 가장 많이 작성한 회원의 리뷰 조회 (서브쿼리 사용)
# WHERE MEMBER_ID = (서브쿼리 결과)
WHERE P.MEMBER_ID = (
    SELECT MEMBER_ID
    FROM REST_REVIEW
    GROUP BY MEMBER_ID
    ORDER BY COUNT(*) DESC
    LIMIT 1    
)
ORDER BY R.REVIEW_DATE, R.REVIEW_TEXT