SELECT *
FROM Users
WHERE registration_date >= CURDATE() - INTERVAL 30 DAY
AND user_id NOT IN (SELECT user_id FROM Registrations);

Output
| user\_id  | full\_name | registration\_date |

