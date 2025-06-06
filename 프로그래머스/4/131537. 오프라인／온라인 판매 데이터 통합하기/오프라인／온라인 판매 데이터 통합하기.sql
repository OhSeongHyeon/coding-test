SELECT
    DATE_FORMAT(SALES_DATE, '%Y-%m-%d') AS SALES_DATE
,   PRODUCT_ID
,   USER_ID
,   SALES_AMOUNT
FROM (
    SELECT
        USER_ID
    ,   PRODUCT_ID
    ,   SALES_AMOUNT
    ,   SALES_DATE
    FROM
        ONLINE_SALE
    UNION ALL
    SELECT
        NULL
    ,   PRODUCT_ID
    ,   SALES_AMOUNT
    ,   SALES_DATE
    FROM
        OFFLINE_SALE
) AS T
WHERE 1=1
AND SALES_DATE >= '2022-03-01' AND SALES_DATE < '2022-04-01'
ORDER BY SALES_DATE, PRODUCT_ID, USER_ID;