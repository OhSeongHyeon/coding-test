SELECT
    ANIMAL_ID
,   NAME
FROM
    ANIMAL_INS
WHERE 1=1
AND ANIMAL_TYPE = 'Dog'
AND NAME LIKE '%el%'
ORDER BY NAME;