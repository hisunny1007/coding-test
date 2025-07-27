-- 코드를 작성해주세요
SELECT COUNT(*) AS FISH_COUNT, FISH_NAME
FROM FISH_NAME_INFO FN
JOIN FISH_INFO FI ON FN.FISH_TYPE = FI.FISH_TYPE
GROUP BY FN.FISH_NAME # GROUP BY에 쓴 절은 SELECT절에 쓰는 게 안전함
ORDER BY FISH_COUNT DESC

# 단순히 문제에서 물고기의 종류별! 이라고 했다고 GROUP BY FISH_TYPE이 아님
# FISH_TYPE은 숫자 / 근데 문제는 이름을 출력
# → GROUP BY를 숫자가 아닌 이름으로 해야 함
# 물고기 이름 별 잡힌 수 출력