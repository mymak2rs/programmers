-- 코드를 입력하세요
SELECT I.NAME, I.DATETIME
FROM (SELECT ANIMAL_ID,NAME,DATETIME FROM ANIMAL_INS ORDER BY DATETIME) I
WHERE I.ANIMAL_ID NOT IN (SELECT ANIMAL_ID FROM ANIMAL_OUTS)
AND ROWNUM < 4