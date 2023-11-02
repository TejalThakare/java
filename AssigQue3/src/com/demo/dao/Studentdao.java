package com.demo.dao;

import com.demo.Beans.StudentInfo;

public interface Studentdao {

	StudentInfo[] findAll();

	StudentInfo findById(int id);

	StudentInfo findByName(String name);

	int calculateGpa(int id3);

}
