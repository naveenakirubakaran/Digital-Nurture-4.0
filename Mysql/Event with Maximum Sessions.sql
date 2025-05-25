SELECT event_id, COUNT(*) AS session_count
FROM Sessions
GROUP BY event_id
ORDER BY session_count DESC
LIMIT 1;

Output
| event_id  | event_title             | session_count |
| --------- | ---------------------- | -------------- |
| 1         | Tech Innovators Meetup | 2              |
