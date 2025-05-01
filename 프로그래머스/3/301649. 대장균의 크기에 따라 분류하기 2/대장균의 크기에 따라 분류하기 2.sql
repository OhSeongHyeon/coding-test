SELECT
    ID
,   CASE
        WHEN (RN / CNT) <= (25 / 100) THEN 'CRITICAL'
        WHEN (RN / CNT) >  (25 / 100) AND (RN / CNT) <= (50 / 100) THEN 'HIGH'
        WHEN (RN / CNT) >  (50 / 100) AND (RN / CNT) <= (75 / 100) THEN 'MEDIUM'
        ELSE 'LOW'
    END AS COLONY_NAME
FROM (
    SELECT
        ID
    ,   ROW_NUMBER() OVER (ORDER BY SIZE_OF_COLONY DESC, ID) AS RN
    ,   COUNT(*) OVER () AS CNT
    FROM
        ECOLI_DATA
) AS E
ORDER BY ID;