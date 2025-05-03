# SELECT
#     *
# FROM
#     DEVELOPERS AS D
# INNER JOIN
#     SKILLCODES AS S
# ON
#     D.SKILL_CODE & S.`CODE`
# ORDER BY
#     D.ID


/* Front End - CODE 
SELECT `CODE`
FROM SKILLCODES
WHERE CATEGORY = 'Front End'
*/
/* Python - CODE 
SELECT `CODE`
FROM SKILLCODES
WHERE `NAME` = 'Python'
*/
/* C# - CODE 
SELECT `CODE`
FROM SKILLCODES
WHERE `NAME` = 'C#'
*/

SELECT
    GRADE
,   ID
,   EMAIL
FROM (
    SELECT
        *
    ,   CASE
            WHEN (
                D.SKILL_CODE & (SELECT SUM(`CODE`) FROM SKILLCODES WHERE CATEGORY = 'Front End') > 0
            AND D.SKILL_CODE & (SELECT `CODE` FROM SKILLCODES WHERE `NAME` = 'Python') > 0
            ) THEN 'A'
            WHEN (
                D.SKILL_CODE & (SELECT `CODE` FROM SKILLCODES WHERE `NAME` = 'C#') > 0
            ) THEN 'B'
            WHEN (
                D.SKILL_CODE & (SELECT SUM(`CODE`) FROM SKILLCODES WHERE CATEGORY = 'Front End') > 0
            ) THEN 'C'
            ELSE NULL
        END AS GRADE
    FROM
        DEVELOPERS AS D
) AS T
WHERE
    GRADE IS NOT NULL
ORDER BY 1, 2;