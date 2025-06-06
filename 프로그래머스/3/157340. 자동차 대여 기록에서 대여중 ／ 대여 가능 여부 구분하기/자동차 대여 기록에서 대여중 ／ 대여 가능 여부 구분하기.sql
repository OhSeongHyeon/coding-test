WITH CTE_CRH AS (
    SELECT
        *
    ,   CASE
            WHEN START_DATE <= '2022-10-16' AND END_DATE >= '2022-10-16' THEN '대여중'
            WHEN START_DATE <= '2022-10-16' AND END_DATE <  '2022-10-16' THEN '대여 가능'
        END AS AVILABILITY
    ,   MAX(END_DATE) OVER (PARTITION BY CAR_ID) AS MAX_END_DATE
    FROM
        CAR_RENTAL_COMPANY_RENTAL_HISTORY
    WHERE 1=1
    AND START_DATE <= '2022-10-16'
)
SELECT
    CAR_ID
,   AVILABILITY
FROM
    CTE_CRH
WHERE 1=1
AND END_DATE = MAX_END_DATE
ORDER BY CAR_ID DESC;
