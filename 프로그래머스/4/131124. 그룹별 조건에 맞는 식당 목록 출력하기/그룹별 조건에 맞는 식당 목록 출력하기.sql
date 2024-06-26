SELECT P.MEMBER_NAME, R.REVIEW_TEXT, TO_CHAR(R.REVIEW_DATE,'YYYY-MM-DD') AS "REVIEW_DATE"
FROM REST_REVIEW R JOIN
(SELECT MEMBER_ID, COUNT(MEMBER_ID)
FROM REST_REVIEW
GROUP BY MEMBER_ID
ORDER BY 2 DESC
FETCH FIRST 1 ROWS ONLY) J
ON (R.MEMBER_ID = J.MEMBER_ID)
JOIN MEMBER_PROFILE P
ON (P.MEMBER_ID = J.MEMBER_ID)
ORDER BY 3, 2;