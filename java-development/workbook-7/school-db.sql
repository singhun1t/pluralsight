-- CREATE DATABASE IF NOT EXISTS school ; -- how to create database with check
DROP DATABASE IF EXISTS school; -- check to see if school database exists and then deletes(drop) it

-- create the database
CREATE DATABASE school; 

-- switch to the school database
USE school;

-- extra check, drop tables if they exist
DROP TABLE IF EXISTS StudentCourses;
DROP TABLE IF EXISTS Students;
DROP TABLE IF EXISTS Courses;

-- create the Students tables
CREATE Table Students (
	StudentID INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    FirstName VARCHAR(50) NOT NULL,
    LastName VARCHAR(50) NOT NULL,
    Birthdate DATE,
    EnrollmentDate DATE,
    Email VARCHAR(100)
);

CREATE TABLE Courses(
	CourseID INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    CourseName VARCHAR(100) NOT NULL,
    CourseDescription TEXT,
    Credits INT NOT NULL
);

CREATE TABLE StudentCourses(
	StudentCourseID INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    StudentID INT,
    CourseID INT, 
    EnrollmentDate DATE,
    -- create the foreign key to reference the primary key studentID WITHIN LINE 17
    FOREIGN KEY (StudentID) REFERENCES Students(StudentID),
    -- another foreign key linking CourseID with CourseID from Courses table
    FOREIGN KEY (CourseID) REFERENCES Courses(CourseID)
);

-- Insert sample data in the students table (have to write tables with primary keys first, before the rest of the tables)
INSERT INTO Students (FirstName, LastName, Birthdate, EnrollmentDate, Email )
Values 
('John', 'Doe', '2000-01-15', '2018-09-01', 'john.doe@example.com'),
('Jane', 'Smith', '1999-04-22', '2018-09-01', 'jane.smith@example.com');

-- INSERT INTO COURSES

INSERT INTO Courses (CourseName, CourseDescription, Credits)
VALUES
('Introduction to Computer Science', " A begginer course in computer science", 3),
('Calculus I ', "An introduction to calculus", 4);

-- insert into studentcourses table
-- ONLY include what you need, studnetcoursid is auto generated
INSERT INTO StudentCourses (StudentID, CourseID, EnrollmentDate)
VALUES 
-- Connects students with the courses they are taking based on ID, which is autoincremented
(1, 1, '2018-09-01'),
(1, 2,'2018-09-01'),
(2, 1, '2018-09-01');
