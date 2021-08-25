create schema EDU_PORTAL;

CREATE TABLE edu_portal.man (
   id VARCHAR(20) NOT NULL,
   created_date TIMESTAMP,
   last_modified_date TIMESTAMP,

   phone VARCHAR(15),
   email VARCHAR(30),
   surname VARCHAR(100),
   name VARCHAR(30),
   patronymic VARCHAR(100),
   birth_day DATE,
);

CREATE TABLE edu_portal.course (
   id VARCHAR(20) NOT NULL,
   created_date TIMESTAMP,
   last_modified_date TIMESTAMP,

   title VARCHAR(100),
   description VARCHAR(500),
   fk_author_id VARCHAR(20),
  foreign key (fk_author_id) references man(id)
);

CREATE TABLE edu_portal.chapter (
   id VARCHAR(20) NOT NULL,
   created_date TIMESTAMP,
   last_modified_date TIMESTAMP,

   title VARCHAR(100),
   description VARCHAR(500),
   fk_course_id VARCHAR(20),
  foreign key (fk_course_id) references course(id)
)

CREATE TABLE edu_portal.task (
   id VARCHAR(20) NOT NULL,
   created_date TIMESTAMP,
   last_modified_date TIMESTAMP,

   title VARCHAR(100),
   task_text VARCHAR(500),
   task_index int,
   task_answer_type VARCHAR(10),
   fk_chapter_id VARCHAR(20),
  foreign key (fk_chapter_id) references chapter(id)
)

CREATE TABLE edu_portal.task_answer (
   id VARCHAR(20) NOT NULL,
   created_date TIMESTAMP,
   last_modified_date TIMESTAMP,

   answer VARCHAR(1024),
   score int,
   fk_task_id VARCHAR(20),
  foreign key (fk_task_id) references task(id)
)

CREATE TABLE edu_portal.student (
   id VARCHAR(20) NOT NULL,
   created_date TIMESTAMP,
   last_modified_date TIMESTAMP,

   score int,
   fk_course_id VARCHAR(20),
  foreign key (fk_course_id) references course(id)
)

CREATE TABLE edu_portal.student_answers (
   fk_student_id VARCHAR(20) NOT NULL,
   fk_task_answer_id VARCHAR(20) NOT NULL,
   foreign key ( fk_student_id) references student(id),
   foreign key (fk_task_answer_id) references task_answer(id)
)

CREATE TABLE edu_portal.chapter_tasks (
   fk_chapter_id VARCHAR(20) NOT NULL,
   fk_task_id VARCHAR(20) NOT NULL,
   foreign key (fk_chapter_id) references chapter(id),
   foreign key (fk_task_id) references task(id)
)





