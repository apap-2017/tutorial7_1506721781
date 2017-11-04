package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.StudentMapper;
import com.example.model.StudentModel;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class StudentServiceDatabase implements StudentService
{
    @Autowired
    private StudentMapper studentMapper;


    @Override
    public StudentModel selectStudent (String npm)
    {
        log.info ("select student with npm {}", npm);
        return studentMapper.selectStudent (npm);
    }


    @Override
    public List<StudentModel> selectAllStudents ()
    {
        log.info ("select all students");
        return studentMapper.selectAllStudents ();
    }


    @Override
    public void addStudent (StudentModel student)
    {
        studentMapper.addStudent (student);
    }


    @Override
    public void deleteStudent (String npm)
    {
    	log.info ("student " + npm + " deleted");
    	studentMapper.deleteStudent (npm);
    }
    
    public void updateStudent (StudentModel student)
    {
    	log.info ("student updated");
    	studentMapper.updateStudent (student);
    }


	@Override
	public void addCourse(String npm, String idCourse) {
		// TODO Auto-generated method stub
		
	}


//	public CourseModel selectCourse(String id_course) {
//        log.info ("select course with id {}", id_course);
//        return studentMapper.selectCourse (id_course);	}

}
