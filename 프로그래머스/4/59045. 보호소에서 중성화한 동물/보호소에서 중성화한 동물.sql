-- 코드를 입력하세요
# 문제: 보호소에서 중성화한 동물
# 입소 시 (ANIMAL_INS) : Intact
# 입양 시 (ANIMAL_OUTS) : Spayed or Neutered
# 즉, IN에도 있고 OUT에도 있는 애들만 대상임
# 보호소 in 중성화 x(Intact), 보호소 out 중성화 o(Spayed or Neutered)
SELECT AO.ANIMAL_ID, AO.ANIMAL_TYPE, AO.NAME
FROM ANIMAL_OUTS AO
JOIN ANIMAL_INS AI ON AO.ANIMAL_ID = AI.ANIMAL_ID
WHERE (AI.SEX_UPON_INTAKE LIKE 'Intact%') 
    AND (
        AO.SEX_UPON_OUTCOME LIKE 'Spayed%'
        OR AO.SEX_UPON_OUTCOME LIKE 'Neutered%'
    )
ORDER BY AO.ANIMAL_ID;
