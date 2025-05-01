SELECT
    CART_ID
FROM (
    SELECT DISTINCT
        CART_ID
    ,   `NAME`
    FROM
        CART_PRODUCTS
    WHERE
        `NAME` = 'Yogurt' OR `NAME` = 'Milk'
) AS C
GROUP BY
    CART_ID
HAVING
    COUNT(*) >= 2
ORDER BY
    CART_ID ASC;