SELECT city, COUNT(DISTINCT user_id) AS user_count
FROM Users u
JOIN Registrations r ON u.user_id = r.user_id
GROUP BY city
ORDER BY user_count DESC
LIMIT 5;


| city        | distinct_user_registrations |
| ----------- | ----------------------------- |
| New York    | 2                             |
| Los Angeles | 2                             |
| Chicago     | 1                             |
