SELECT event_id, COUNT(*) AS session_count
FROM Sessions
WHERE HOUR(start_time) BETWEEN 10 AND 11
GROUP BY event_id;


Output
| session_id  | event_id  | title           | start_time         | end_time          |
| ----------- | --------- | --------------- | ------------------ | ------------------ |
| 1           | 1         | Opening Keynote | 2025-06-10 10:00AM | 2025-06-10 11:00AM |
| 4           | 3         | Intro to HTML5  | 2025-07-01 10:00AM | 2025-07-01 12:00PM |
