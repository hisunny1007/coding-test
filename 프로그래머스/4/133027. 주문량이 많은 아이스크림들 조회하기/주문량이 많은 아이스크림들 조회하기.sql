-- 코드를 입력하세요
# 7월 아이스크림 주문량
# 상반기 아이스크림 주문량
# 두 개 합쳐서
# 총 주문량 많은 순서대로 상위 3개 조회

# => GROUP BY *JULY 테이블에 같은 FLAVOR 여러 줄 있을 수 있어서
# 합계 내려면 GROUP BY 필요
SELECT F.FLAVOR
FROM FIRST_HALF F
JOIN JULY J
ON F.FLAVOR = J.FLAVOR
GROUP BY F.FLAVOR
ORDER BY SUM(F.TOTAL_ORDER + J.TOTAL_ORDER) DESC
LIMIT 3;