package com.demo.StudentServices;

import com.demo.Beans.StudentInfo;

public interface StudentService {

	StudentInfo[] displayAll();

	StudentInfo displayById(int id);

	StudentInfo displayByName(String name);

	int calculateGpa(int id3);

}
