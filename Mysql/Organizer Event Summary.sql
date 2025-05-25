SELECT u.full_name,
       e.status,
       COUNT(e.event_id) AS total_events
FROM Events e
JOIN Users u ON e.organizer_id = u.user_id
GROUP BY u.user_id, e.status;


Output
| user_id  | full_name      | status     | event_count |
| -------- | ------------- | --------- | ------------ |
| 1        | Alice Johnson | upcoming  | 1            |
| 2        | Bob Smith     | upcoming  | 1            |
| 3        | Charlie Lee   | completed | 1            |
