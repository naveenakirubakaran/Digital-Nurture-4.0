SELECT speaker_name, COUNT(*) AS total_sessions
FROM Sessions
GROUP BY speaker_name
HAVING total_sessions > 1;

Output
| speaker\_name | session\_count |
