SELECT event_id,
       AVG(TIMESTAMPDIFF(MINUTE, start_time, end_time)) AS avg_duration_minutes
FROM Sessions
GROUP BY event_id;


Output

| event_id  | event_title                   | avg_duration_minutes |
| --------- | ----------------------------- | ---------------------- |
| 1         | Tech Innovators Meetup        | 67.50                  |
| 2         | AI & ML Conference            | 90.00                  |
| 3         | Frontend Development Bootcamp | 120.00                 |
