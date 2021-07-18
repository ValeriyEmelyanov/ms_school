DROP TABLE IF EXISTS Student;

CREATE TABLE Student (
                         id INT PRIMARY KEY,
                         name VARCHAR(50) NOT NULL,
                         class_section VARCHAR(50) NOT NULL,
                         class_teacher_id INT NOT NULL

);
