# SELECT
#     *
# FROM
#     ANIMAL_INS
# WHERE 1=1
# AND (SEX_UPON_INTAKE NOT LIKE 'Spayed%'
# AND  SEX_UPON_INTAKE NOT LIKE 'Neutered%')

# SELECT
#     *
# FROM
#     ANIMAL_OUTS
# WHERE 1=1
# AND SEX_UPON_OUTCOME LIKE 'Spayed%'
# OR  SEX_UPON_OUTCOME LIKE 'Neutered%'

SELECT
    O.ANIMAL_ID
,   O.ANIMAL_TYPE
,   O.`NAME`
FROM (
    SELECT
        ANIMAL_ID
    FROM
        ANIMAL_INS
    WHERE
        SEX_UPON_INTAKE LIKE 'Intact%'
) AS I
INNER JOIN (
    SELECT
        ANIMAL_ID
    ,   ANIMAL_TYPE
    ,   `NAME`
    FROM
        ANIMAL_OUTS
    WHERE
        SEX_UPON_OUTCOME LIKE 'Spayed%' OR SEX_UPON_OUTCOME LIKE 'Neutered%'
) AS O
ON
    I.ANIMAL_ID = O.ANIMAL_ID
ORDER BY 1;