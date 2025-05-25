SELECT DATE_FORMAT(registration_date, '%Y-%m') AS month, COUNT(*) AS registrations
FROM Registrations
WHERE registration_date >= CURDATE() - INTERVAL 12 MONTH
GROUP BY month
ORDER BY month;


Output

| reg_month | registrations |
| ---------- | ------------- |
| 2025-04    | 2             |
| 2025-05    | 2             |
| 2025-06    | 1             |
