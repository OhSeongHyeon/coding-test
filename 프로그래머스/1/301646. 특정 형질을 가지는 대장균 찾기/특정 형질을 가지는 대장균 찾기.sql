/*
아래의 쿼리로 결과를 보면 ID = 2 일때 `4 포함` 컬럼의 값이 0 이 나온다.
이유는 형변환 문제로 발생한다.
CONV(GENOTYPE, 10, 2) 의 반환값은 "1111"(문자열)이며
이때 비트연산을 위해 형변환을 수행하는데 이는 "1111"을 10진수의 1111로 형변환 된다.
2진수로 나타내면 10001010111 이 되는데 이와 1000 을 비트연산 하게 된다면
`4 포함`컬럼의 값이 0 이 되는것.
해결 - GENOTYPE & 8
*/
/*
SELECT
    ID
,   PARENT_ID
,   GENOTYPE
,   CONV(GENOTYPE, 10, 2) AS GENOTYPE_BINARY
,   CONV(GENOTYPE, 10, 2) & b'0001' AS `1 포함`
,   CONV(GENOTYPE, 10, 2) & b'0010' AS `2 포함`
,   CONV(GENOTYPE, 10, 2) & b'0100' AS `3 포함`
,   CONV(GENOTYPE, 10, 2) & b'1000' AS `4 포함`
FROM
    ECOLI_DATA;
*/

# SELECT
#     ID
# ,   PARENT_ID
# ,   GENOTYPE
# ,   CONV(GENOTYPE, 10, 2) AS GENOTYPE_BINARY
# ,   GENOTYPE & 1 AS `1 포함`
# ,   GENOTYPE & 2 AS `2 포함`
# ,   GENOTYPE & 4 AS `3 포함`
# ,   GENOTYPE & 8 AS `4 포함`
# FROM
#     ECOLI_DATA;

SELECT
    COUNT(*) AS `COUNT`
FROM
    ECOLI_DATA
WHERE 1=1
# AND GENOTYPE & 2  = 0
# AND GENOTYPE & 5 != 0
/* 위와 같음 */
AND NOT(GENOTYPE & 2)
AND GENOTYPE & 5
