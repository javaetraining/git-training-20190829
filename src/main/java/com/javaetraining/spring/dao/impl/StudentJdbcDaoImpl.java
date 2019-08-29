package com.javaetraining.spring.dao.impl;

import org.springframework.stereotype.Repository;

import com.javaetraining.spring.bean.Student;
import com.javaetraining.spring.dao.StudentDao;

@Repository("studentDao")
public class StudentJdbcDaoImpl implements StudentDao {

	@Override
	public int save(Student student) {
		return student.getId();
	}

}
