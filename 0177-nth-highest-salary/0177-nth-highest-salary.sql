CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
    DECLARE result INT;
    SELECT COUNT(DISTINCT salary) INTO result FROM employee;
    IF N<0 THEN
    RETURN NULL;
    END IF;
    IF result < N THEN
        RETURN NULL;
    END IF;

    RETURN (
        SELECT salary
        FROM (
            SELECT DISTINCT salary
            FROM employee
            ORDER BY salary DESC
            LIMIT N
        ) AS e
        ORDER BY salary ASC
        LIMIT 1
    );
END;
