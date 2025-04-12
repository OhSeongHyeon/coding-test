SELECT
    T1.ID
# ,   T1.PARENT_ID
# ,   T1.SIZE_OF_COLONY
# ,   T1.DIFFERENTIATION_DATE
,   T1.GENOTYPE
# ,   CONV(T1.GENOTYPE, 10, 2) AS 'GENOTYPE_BINARY'
,   T2.GENOTYPE AS 'PARENT_GENOTYPE'
# ,   CONV(T2.GENOTYPE, 10, 2) AS 'PARENT_GENOTYPE_BINARY'
# ,   T1.GENOTYPE & T2.GENOTYPE
FROM
    ECOLI_DATA AS T1
LEFT JOIN
    ECOLI_DATA AS T2
ON
    T1.PARENT_ID = T2.ID
WHERE
    T2.GENOTYPE IS NOT NULL
AND
    (T1.GENOTYPE & T2.GENOTYPE) = T2.GENOTYPE
ORDER BY T1.ID ASC;