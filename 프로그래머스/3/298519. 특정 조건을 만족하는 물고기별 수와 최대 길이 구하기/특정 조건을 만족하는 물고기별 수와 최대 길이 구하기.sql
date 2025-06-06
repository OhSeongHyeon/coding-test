/*
SELECT
    FISH_COUNT
,   LENGTH AS MAX_LENGTH
,   FISH_TYPE
FROM (
    SELECT
        FISH_TYPE
    ,   LENGTH
    ,   AVG(IFNULL(LENGTH, 10)) OVER (PARTITION BY FISH_TYPE) AS AVG_LEN
    ,   DENSE_RANK() OVER (PARTITION BY FISH_TYPE ORDER BY LENGTH DESC) AS LEN_RANK
    ,   COUNT(*) OVER (PARTITION BY FISH_TYPE) AS FISH_COUNT
    FROM
        FISH_INFO
) AS AGGR_FISH_INFO
WHERE 1=1
AND AVG_LEN >= 33
AND LEN_RANK = 1
*/

/*
SELECT
    FISH_TYPE
,   AVG(IFNULL(LENGTH, 10)) AS AVG_LEN
,   MAX(LENGTH)
,   COUNT(*) AS FISH_COUNT
FROM
    FISH_INFO
GROUP BY
    FISH_TYPE
HAVING
    AVG(IFNULL(LENGTH, 10)) >= 33
*/


SELECT
    COUNT(*)    AS FISH_COUNT
,   MAX(LENGTH) AS MAX_LENGTH
,   FISH_TYPE
FROM
    FISH_INFO
GROUP BY
    FISH_TYPE
HAVING
    AVG(IFNULL(LENGTH, 10)) >= 33
ORDER BY
    FISH_TYPE;