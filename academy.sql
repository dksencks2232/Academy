SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS attend;
DROP TABLE IF EXISTS Record;
DROP TABLE IF EXISTS Regist;
DROP TABLE IF EXISTS Review_Board;
DROP TABLE IF EXISTS StudentMember;
DROP TABLE IF EXISTS Notice_Board;
DROP TABLE IF EXISTS QNA_Comment;
DROP TABLE IF EXISTS Teacher;
DROP TABLE IF EXISTS EDC;
DROP TABLE IF EXISTS QNA_Board;




/* Create Tables */

CREATE TABLE attend
(
	Stu_Num int NOT NULL,
	Attend_Check int DEFAULT 0 NOT NULL,
	Attend_Late int DEFAULT 0 NOT NULL,
	Attend_Leave int DEFAULT 0 NOT NULL,
	Attend_Day int NOT NULL,
	Attend_StartTime datetime NOT NULL,
	Attend_endTime datetime NOT NULL,
	PRIMARY KEY (Stu_Num)
);


CREATE TABLE EDC
(
	EDC_Num int NOT NULL,
	EDC_Subject varchar(50) NOT NULL,
	EDC_Place varchar(20) NOT NULL,
	EDC_Time varchar(30) NOT NULL,
	EDC_PD varchar(30) NOT NULL,
	EDC_NMPR varchar(20) NOT NULL,
	EDC_Photo varchar(50) NOT NULL,
	EDC_Content varchar(4000) NOT NULL,
	PRIMARY KEY (EDC_Num)
);


CREATE TABLE Notice_Board
(
	Notice_Board_Num int NOT NULL AUTO_INCREMENT,
	Teacher_ID varchar(20),
	Notice_Board_Title varchar(50) NOT NULL,
	Notice_Board_Date date NOT NULL,
	Notice_Board_Hit varchar(100) NOT NULL,
	Notice_Board_Content varchar(4000) NOT NULL,
	PRIMARY KEY (Notice_Board_Num)
);


CREATE TABLE QNA_Board
(
	QNA_Board_Num int NOT NULL,
	QNA_Board_Name varchar(20) NOT NULL,
	QNA_Board_Password varchar(20) NOT NULL,
	QNA_Board_Title varchar(50) NOT NULL,
	QNA_Board_Date date NOT NULL,
	QNA_Board_Hit varchar(100) NOT NULL,
	QNA_Board_Content varchar(4000) NOT NULL,
	PRIMARY KEY (QNA_Board_Num)
);


CREATE TABLE QNA_Comment
(
	QNA_Com_Num int NOT NULL AUTO_INCREMENT,
	Teacher_ID varchar(20) NOT NULL,
	QNA_Com_Date date,
	QNA_Com_Content  varchar(2000) NOT NULL,
	QNA_Com_Re_Ref   int NOT NULL,
	QNA_Com_lvl  int NOT NULL,
	QNA_Board_Num int,
	PRIMARY KEY (QNA_Com_Num)
);


CREATE TABLE Record
(
	Record_Num int NOT NULL,
	Teacher_ID varchar(20) NOT NULL,
	EDC_Num int NOT NULL,
	PRIMARY KEY (Record_Num)
);


CREATE TABLE Regist
(
	Regist_Num int NOT NULL AUTO_INCREMENT,
	EDC_Num int NOT NULL,
	Regsit_Name varchar(20) NOT NULL,
	Regist_Birth varchar(30) NOT NULL,
	Regist_Phone varchar(30) NOT NULL,
	Regist_Date date NOT NULL,
	Regist_Pro_Check varchar(3) NOT NULL,
	Regist_Check varchar(3) NOT NULL,
	Regist_Content varchar(100) NOT NULL,
	PRIMARY KEY (Regist_Num)
);


CREATE TABLE Review_Board
(
	Review_Board_Num int NOT NULL,
	Stu_Num int,
	Review_Board_Title varchar(50) NOT NULL,
	Review_Board_Date date NOT NULL,
	Review_Board_Hit varchar(100) NOT NULL,
	Review_Board_Content varchar(4000) NOT NULL,
	PRIMARY KEY (Review_Board_Num)
);


CREATE TABLE StudentMember
(
	Stu_Num int NOT NULL AUTO_INCREMENT,
	EDC_Num int NOT NULL,
	Stu_Name varchar(20) NOT NULL,
	Stu_Gender varchar(2) NOT NULL,
	Stu_Birth varchar(10) NOT NULL,
	Stu_Email varchar(20) NOT NULL,
	Stu_Phone varchar(25) NOT NULL,
	Stu_Address varchar(150) NOT NULL,
	Lecture_Time varchar(10) NOT NULL,
	Stu_Photo varchar(50) NOT NULL,
	Stu_ID varchar(20) NOT NULL,
	Stu_PW varchar(20) NOT NULL,
	PRIMARY KEY (Stu_Num),
	UNIQUE (Stu_ID)
);


CREATE TABLE Teacher
(
	Teacher_ID varchar(20) NOT NULL,
	EDC_Num int,
	Teacher_Name varchar(20) NOT NULL,
	Teacher_Gender varchar(2) NOT NULL,
	Teacher_Phone varchar(25) NOT NULL,
	Teacher_Grade varchar(3) NOT NULL,
	Teacher_PW varchar(20) NOT NULL,
	PRIMARY KEY (Teacher_ID)
);



/* Create Foreign Keys */

ALTER TABLE Record
	ADD FOREIGN KEY (EDC_Num)
	REFERENCES EDC (EDC_Num)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Regist
	ADD FOREIGN KEY (EDC_Num)
	REFERENCES EDC (EDC_Num)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE StudentMember
	ADD FOREIGN KEY (EDC_Num)
	REFERENCES EDC (EDC_Num)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Teacher
	ADD FOREIGN KEY (EDC_Num)
	REFERENCES EDC (EDC_Num)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE QNA_Comment
	ADD FOREIGN KEY (QNA_Board_Num)
	REFERENCES QNA_Board (QNA_Board_Num)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE attend
	ADD FOREIGN KEY (Stu_Num)
	REFERENCES StudentMember (Stu_Num)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Review_Board
	ADD FOREIGN KEY (Stu_Num)
	REFERENCES StudentMember (Stu_Num)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Notice_Board
	ADD FOREIGN KEY (Teacher_ID)
	REFERENCES Teacher (Teacher_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE QNA_Comment
	ADD FOREIGN KEY (Teacher_ID)
	REFERENCES Teacher (Teacher_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Record
	ADD FOREIGN KEY (Teacher_ID)
	REFERENCES Teacher (Teacher_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;



