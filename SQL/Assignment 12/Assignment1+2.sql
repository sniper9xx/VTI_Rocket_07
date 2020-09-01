DROP DATABASE IF EXISTS `Assignment12`;
CREATE DATABASE IF NOT EXISTS `Assignment12`;
USE `Assignment12`;

DROP TABLE IF EXISTS `Department`;
CREATE TABLE `Department` (
    DepartmentID TINYINT AUTO_INCREMENT,
    DepartmentName VARCHAR(30) NOT NULL,
    PRIMARY KEY (DepartmentID),
	UNIQUE KEY (DepartmentName)
);

DROP TABLE IF EXISTS `Position`;
CREATE TABLE `Position` (
    PositionID TINYINT AUTO_INCREMENT,
    PositionName ENUM('Dev', 'Test', 'Scrum Master', 'PM'),
    PRIMARY KEY (PositionID)
);

DROP TABLE IF EXISTS `Account`;
CREATE TABLE `Account` (
    AccountID SMALLINT AUTO_INCREMENT,
    Email VARCHAR(30),
    Username VARCHAR(20) NOT NULL,
    FullName VARCHAR(20) NOT NULL,
    DepartmentID TINYINT NOT NULL,
    PositionID TINYINT NOT NULL,
    CreateDate DATE NOT NULL,
    PRIMARY KEY (AccountID),
    FOREIGN KEY (PositionID)
        REFERENCES `Position` (PositionID)
        ON DELETE CASCADE,
    FOREIGN KEY (DepartmentID)
        REFERENCES `Department` (DepartmentID)
        ON DELETE CASCADE,
    UNIQUE KEY (Email , Username)
);

DROP TABLE IF EXISTS `Group`;
CREATE TABLE `Group` (
    GroupID SMALLINT AUTO_INCREMENT,
    GroupName VARCHAR(50) NOT NULL,
    CreatorID SMALLINT NOT NULL,
    CreateDate DATE,
    PRIMARY KEY (GroupID),
    UNIQUE KEY (GroupName)
);

DROP TABLE IF EXISTS `GroupAccount`;
CREATE TABLE `GroupAccount` (
    GroupID SMALLINT NOT NULL,
    AccountID SMALLINT NOT NULL,
    JoinDate DATE NOT NULL,
    PRIMARY KEY (GroupID , AccountID),
    FOREIGN KEY (GroupID)
        REFERENCES `Group` (GroupID)
        ON DELETE CASCADE,
    FOREIGN KEY (AccountID)
        REFERENCES `Account` (AccountID)
        ON DELETE CASCADE
);

DROP TABLE IF EXISTS `TypeQuestion`;
CREATE TABLE `TypeQuestion` (
    TypeID MEDIUMINT AUTO_INCREMENT,
    TypeName ENUM('Essay', 'Multiple-Choice'),
    PRIMARY KEY (TypeID)
);

DROP TABLE IF EXISTS `CategoryQuestion`;
CREATE TABLE `CategoryQuestion` (
    CategoryID MEDIUMINT AUTO_INCREMENT,
    CategoryName VARCHAR(20) NOT NULL,
    PRIMARY KEY (CategoryID)
);

DROP TABLE IF EXISTS `Question`;
CREATE TABLE `Question` (
    QuestionID MEDIUMINT AUTO_INCREMENT,
    Content TEXT NOT NULL,
    CategoryID MEDIUMINT NOT NULL,
    TypeID MEDIUMINT NOT NULL,
    CreatorID SMALLINT NOT NULL,
    CreateDate DATE NOT NULL,
    PRIMARY KEY (QuestionID),
    FOREIGN KEY (CategoryID)
        REFERENCES `CategoryQuestion` (CategoryID)
        ON DELETE CASCADE,
    FOREIGN KEY (TypeID)
        REFERENCES `TypeQuestion` (TypeID)
        ON DELETE CASCADE
);

DROP TABLE IF EXISTS `Answer`;							
CREATE TABLE `Answer` (
    AnswerID MEDIUMINT AUTO_INCREMENT,
    Content TEXT NOT NULL,
    QuestionID MEDIUMINT NOT NULL,
    isCorrect ENUM('True', 'False'),
    PRIMARY KEY (AnswerID),
    FOREIGN KEY (QuestionID)
        REFERENCES `Question` (QuestionID)
        ON DELETE CASCADE
);

DROP TABLE IF EXISTS `Exam`;
CREATE TABLE `Exam` (
    ExamID SMALLINT AUTO_INCREMENT,
    `Code` SMALLINT NOT NULL,
    Title VARCHAR(30) NOT NULL,
    CategoryID MEDIUMINT NOT NULL,
    Duration TIME NOT NULL,
    CreatorID SMALLINT NOT NULL,
    CreateDate DATE NOT NULL,
    PRIMARY KEY (ExamID),
    UNIQUE KEY (`Code`)
);

DROP TABLE IF EXISTS `ExamQuestion`;
CREATE TABLE `ExamQuestion` (
    ExamID SMALLINT NOT NULL,
    QuestionID MEDIUMINT NOT NULL,
    PRIMARY KEY (ExamID , QuestionID),
    FOREIGN KEY (ExamID)
        REFERENCES `Exam` (ExamID)
        ON DELETE CASCADE,
    FOREIGN KEY (QuestionID)
        REFERENCES `Question` (QuestionID)
        ON DELETE CASCADE
);








