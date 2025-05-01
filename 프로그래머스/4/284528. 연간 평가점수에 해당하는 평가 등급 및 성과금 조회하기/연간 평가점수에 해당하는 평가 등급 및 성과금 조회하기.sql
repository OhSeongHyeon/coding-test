SELECT
    EMP_NO
,   EMP_NAME
,   CASE
        WHEN AVG_SCORE >= 96 THEN 'S'
        WHEN AVG_SCORE >= 90 THEN 'A'
        WHEN AVG_SCORE >= 80 THEN 'B'
        ELSE 'C'
    END AS GRADE
,   CASE
        WHEN AVG_SCORE >= 96 THEN SAL * 20 / 100
        WHEN AVG_SCORE >= 90 THEN SAL * 15 / 100
        WHEN AVG_SCORE >= 80 THEN SAL * 10 / 100
        ELSE 0
    END AS BONUS
FROM (
    SELECT
        E.EMP_NO
    ,   E.EMP_NAME
    ,   E.SAL
    ,   AVG(G.SCORE) AS AVG_SCORE
    FROM
        HR_EMPLOYEES AS E
    INNER JOIN
        HR_GRADE AS G
    ON
        E.EMP_NO = G.EMP_NO
    GROUP BY
        E.EMP_NO
) AS T
ORDER BY EMP_NO ASC;