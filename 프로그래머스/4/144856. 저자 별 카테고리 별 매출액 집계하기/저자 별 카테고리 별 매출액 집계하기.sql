SELECT
    A.AUTHOR_ID
,   A.AUTHOR_NAME
,   B.CATEGORY
,   SUM(B.PRICE * S.SALES) AS TOTAL_SALES
FROM
    BOOK AS B
INNER JOIN
    BOOK_SALES AS S
ON
    B.BOOK_ID = S.BOOK_ID
INNER JOIN
    AUTHOR AS A
ON
    B.AUTHOR_ID = A.AUTHOR_ID
WHERE
    S.SALES_DATE >= '2022-01-01' AND S.SALES_DATE < '2022-02-01'
GROUP BY
    A.AUTHOR_ID
,   A.AUTHOR_NAME
,   B.CATEGORY
ORDER BY
    1, 3 DESC;