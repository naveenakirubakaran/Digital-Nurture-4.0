SELECT u.full_name, COUNT(f.feedback_id) AS total_feedbacks
FROM Users u
JOIN Feedback f ON u.user_id = f.user_id
GROUP BY u.user_id
ORDER BY total_feedbacks DESC
LIMIT 5;


Output

| user_id  | full_name   | feedback_count |
| -------- | ----------- | --------------- |
| 2        | Bob Smith   | 1               |
| 3        | Charlie Lee | 1               |
| 4        | Diana King  | 1               |
