# /* NOT EXISTS
SELECT
    ANIMAL_ID
,   NAME
FROM
    ANIMAL_OUTS AS O
WHERE NOT EXISTS (
    SELECT 1
    FROM ANIMAL_INS AS I
    WHERE I.ANIMAL_ID = O.ANIMAL_ID
)
ORDER BY ANIMAL_ID;
# */

/* JOIN */
# SELECT
#     O.ANIMAL_ID
# ,   O.NAME
# FROM
#     ANIMAL_OUTS AS O
# LEFT JOIN
#     ANIMAL_INS AS I
# ON
#     O.ANIMAL_ID = I.ANIMAL_ID
# WHERE
#     I.ANIMAL_ID IS NULL
# ORDER BY O.ANIMAL_ID;