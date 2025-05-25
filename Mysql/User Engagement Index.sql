SELECT u.user_id, u.full_name,
       COUNT(DISTINCT r.event_id) AS events_attended,
       COUNT(DISTINCT f.feedback_id) AS feedbacks_given
FROM Users u
LEFT JOIN Registrations r ON u.user_id = r.user_id
LEFT JOIN Feedback f ON u.user_id = f.user_id
GROUP BY u.user_id;


Output

| user\_id | full\_name    | events\_attended | feedbacks\_given |
| -------- | ------------- | ---------------- | ---------------- |
| 1        | Alice Johnson | 1                | 0                |
| 2        | Bob Smith     | 1                | 1                |
| 3        | Charlie Lee   | 1                | 1                |
| 4        | Diana King    | 1                | 1                |
| 5        | Ethan Hunt    | 1                | 0                |
