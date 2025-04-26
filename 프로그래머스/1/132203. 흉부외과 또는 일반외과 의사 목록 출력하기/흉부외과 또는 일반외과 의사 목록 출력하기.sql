-- 코드를 입력하세요
SELECT DR_NAME, DR_ID, MCDP_CD, DATE_FORMAT(HIRE_YMD, '%Y-%m-%d') AS HIRE_YMD
FROM DOCTOR
WHERE MCDP_CD = 'CS'
    OR MCDP_CD = 'GS'
ORDER BY HIRE_YMD DESC, DR_NAME

# %Y-%m-%d : 연도-월-일 형식을 지정하는 포맷 (2020-03-01)
# SELECT DATE_FORMAT(NOW(), '%Y-%m-%d')
# %Y : 2025
# %y : 25