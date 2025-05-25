SELECT event_id,
       SUM(resource_type = 'pdf') AS pdf_count,
       SUM(resource_type = 'image') AS image_count,
       SUM(resource_type = 'link') AS link_count
FROM Resources
GROUP BY event_id;


Output
| event_id  | event_title                   | pdf_count  | image_count  | link_count |
| --------- | ----------------------------- | ---------- | ------------ | ----------- |
| 1         | Tech Innovators Meetup        | 1          | 0            | 0           |
| 2         | AI & ML Conference            | 0          | 1            | 0           |
| 3         | Frontend Development Bootcamp | 0          | 0            | 1           |
