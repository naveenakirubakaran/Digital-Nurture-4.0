SELECT e.title, COUNT(r.registration_id) AS total_registrations
FROM Events e
JOIN Registrations r ON e.event_id = r.event_id
GROUP BY e.event_id
ORDER BY total_registrations DESC
LIMIT 3;

Output
| event_id  | event_title            | total_registrations |
| --------- | ---------------------- | -------------------- |
| 1         | Tech Innovators Meetup | 2                    |
| 2         | AI & ML Conference     | 2                    |
| 3         | Frontend Bootcamp      | 1                    |
