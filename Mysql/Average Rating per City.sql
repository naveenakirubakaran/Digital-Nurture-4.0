SELECT e.city, AVG(f.rating) AS avg_rating
FROM Events e
JOIN Feedback f ON e.event_id = f.event_id
GROUP BY e.city;

Output
| city     | avg_rating |
| -------- | ----------- |
| New York | 3.0         |
| Chicago  | 4.5         |
