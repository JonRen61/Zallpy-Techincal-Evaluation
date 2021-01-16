CREATE TABLE user (id INT NOT NULL AUTO_INCREMENT, name VARCHAR(100), email VARCHAR(100), password VARCHAR(150), PRIMARY KEY(id));

CREATE TABLE project (id INT NOT NULL AUTO_INCREMENT, name VARCHAR(100), appointed_hours INT, date DATE, PRIMARY KEY(id));

CREATE TABLE user_project (
	user_id INT NOT NULL, 
	project_id INT NOT NULL,
	PRIMARY KEY (user_id, project_id));
ALTER TABLE user_project ADD FOREIGN KEY (user_id) REFERENCES user (id);
ALTER TABLE user_project ADD FOREIGN KEY (project_id) REFERENCES project (id);
