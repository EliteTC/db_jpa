package com.besedkin;

import java.sql.Date;
import java.util.List;

import org.hibernate.Hibernate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App{
public static void main( String[] args ) {
ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
Lecture lecture = new Lecture();
lecture.setName("Introduction to Spring");
lecture.setCredits(2.5);
LecturesWorker worker = (LecturesWorker)context.getBean("lecturesWorker");
worker.addLecture(lecture);
Teacher t = new Teacher();
t.setFirstname("fname");
t.setLastname("lname");
t.setBirthDate(new Date(0));
t.setCellphone("0035325327523");
AddressWorker adw = (AddressWorker)context.getBean("addressWorker");
Address adr = adw.getAddress(1);
t.setAddress(adr);
WorkWithTeacher teachWorker = (WorkWithTeacher)context.getBean("teacherWorker");
teachWorker.addTeacher(t);
Teacher teacher = teachWorker.getTeacher(3);
System.out.println(teacher.getCathedrals().toString());

Student stud = new Student();
stud.setPib("students pib");
stud.setCourse(3);

WorkWithStudents studWorker = (WorkWithStudents)context.getBean("studentWorker");
studWorker.saveStudentToDb(stud);
//lazy-eager loading problem
List<Student> studs = teacher.getStudents();
System.out.println(studs.toString());
}
}