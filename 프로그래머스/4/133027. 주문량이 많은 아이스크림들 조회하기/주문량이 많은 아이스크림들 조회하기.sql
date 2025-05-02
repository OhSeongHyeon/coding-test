# select * from first_half order by 1;
# select * from july order by 1;


# SELECT
#     *
# FROM
#     FIRST_HALF AS F
# RIGHT JOIN
#     JULY AS J
# ON
#     F.SHIPMENT_ID = J.SHIPMENT_ID
# UNION
# SELECT
#     *
# FROM
#     FIRST_HALF AS F
# LEFT JOIN
#     JULY AS J
# ON
#     F.SHIPMENT_ID = J.SHIPMENT_ID;


# SELECT
#     *
# FROM (
#     SELECT
#         FLAVOR
#     ,   SUM(TOTAL_ORDER) AS TOTAL_SUM
#     FROM
#         FIRST_HALF
#     GROUP BY
#         FLAVOR
# ) AS F
# INNER JOIN (
#     SELECT
#         FLAVOR
#     ,   SUM(TOTAL_ORDER) AS TOTAL_SUM
#     FROM
#         JULY
#     GROUP BY
#         FLAVOR
# ) AS J
# ON
#     F.FLAVOR = J.FLAVOR

SELECT
    FLAVOR
FROM (
    SELECT
        FLAVOR
    ,   SUM(TOTAL_SUM)
    FROM (
        SELECT
            J.FLAVOR
        ,   SUM(J.TOTAL_ORDER) AS TOTAL_SUM
        FROM
            FIRST_HALF AS F
        RIGHT JOIN
            JULY AS J
        ON
            F.SHIPMENT_ID = J.SHIPMENT_ID
        GROUP BY
            J.FLAVOR
        UNION
        SELECT
            F.FLAVOR
        ,   SUM(F.TOTAL_ORDER) AS TOTAL_SUM
        FROM
            FIRST_HALF AS F
        LEFT JOIN
            JULY AS J
        ON
            F.SHIPMENT_ID = J.SHIPMENT_ID
        GROUP BY
            F.FLAVOR
    ) AS FJ
    GROUP BY
        FLAVOR
    ORDER BY 2 DESC
) AS FJ2
LIMIT 3;