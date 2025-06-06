WITH AGGR_USER_SALES AS (
    SELECT
        U.USER_ID
    ,   YEAR(S.SALES_DATE)  AS SALES_YEAR
    ,   MONTH(S.SALES_DATE) AS SALES_MONTH
    ,   COUNT(*) AS SALES_CNT
    FROM
        USER_INFO AS U
    INNER JOIN
        ONLINE_SALE AS S
    ON
        U.USER_ID = S.USER_ID
    WHERE
        YEAR(U.JOINED) = 2021
    GROUP BY
        U.USER_ID
    ,   SALES_YEAR
    ,   SALES_MONTH
    # ORDER BY 1, 2, 3
),
AGGR_SALES_DATE AS (
    SELECT
        SALES_YEAR AS `YEAR`
    ,   SALES_MONTH AS `MONTH`
    ,   COUNT(SALES_CNT) AS PURCHASED_USERS
    FROM
        AGGR_USER_SALES
    GROUP BY 1, 2
    # ORDER BY 1, 2
),
`2021_JOINED` AS (
    SELECT
        COUNT(*) AS `2021_JOINED_CNT`
    FROM
        USER_INFO
    WHERE
        YEAR(JOINED) = 2021
)
SELECT
    *
,   ROUND(PURCHASED_USERS / (SELECT `2021_JOINED_CNT` FROM `2021_JOINED`), 1) AS PUCHASED_RATIO
FROM
    AGGR_SALES_DATE
ORDER BY 1, 2;
#--------------------------------------------------------
























