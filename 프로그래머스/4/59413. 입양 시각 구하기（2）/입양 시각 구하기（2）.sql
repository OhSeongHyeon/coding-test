WITH RECURSIVE FAKE_TB AS (
    SELECT
        0 AS `HOUR`
    UNION ALL
    SELECT
        `HOUR` + 1
    FROM
        FAKE_TB
    WHERE
        `HOUR` < 23
)
SELECT
    F.`HOUR`
,   IFNULL(O.`CNT`, 0) AS `COUNT`
FROM
    FAKE_TB AS F
LEFT JOIN (
    SELECT
        `HOUR`
    ,   COUNT(*) AS `CNT`
    FROM (
        SELECT HOUR(DATETIME) AS `HOUR`
        FROM ANIMAL_OUTS
    ) AS A
    GROUP BY `HOUR`
) AS O
ON
    F.`HOUR` = O.`HOUR`
ORDER BY 1;