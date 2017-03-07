package com.besedkin;

import org.springframework.beans.factory.annotation.Autowired;

public class WorkWithTeacher {
@Autowired
private TeachersDao teachersDao;
public Teacher addTeacher(Teacher teacher){
teachersDao.addTeacher(teacher);
System.out.println("Teacher has been added "+teacher);
return teacher;
}
public Teacher getTeacher(int id){
return teachersDao.getTeacher(id);
}
public void saveTeacher(Teacher teacher){
teachersDao.saveTeacher(teacher);
System.out.println("Teacher has been saved "+teacher);
}
}
