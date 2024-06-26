-- 코드를 입력하세요
SELECT 
TO_CHAR(S.SALES_DATE, 'YYYY') AS YEAR,
TO_NUMBER(TO_CHAR(S.SALES_DATE, 'MM')) AS MONTH,
I.GENDER,
COUNT(DISTINCT S.USER_ID) AS USERS
FROM USER_INFO I JOIN ONLINE_SALE S
ON(I.USER_ID = S.USER_ID)
WHERE GENDER IS NOT NULL
GROUP BY TO_CHAR(S.SALES_DATE, 'YYYY'), TO_NUMBER(TO_CHAR(S.SALES_DATE, 'MM')), I.GENDER
ORDER BY 1,2,3;