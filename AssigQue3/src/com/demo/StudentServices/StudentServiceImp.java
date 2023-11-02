package com.demo.StudentServices;


import com.demo.Beans.StudentInfo;
import com.demo.dao.Studentdao;
import com.demo.dao.StudentdaoImp;

public class StudentServiceImp implements StudentService {
	private Studentdao pdao;
	public StudentServiceImp() {
		pdao=new StudentdaoImp();
	}

	@Override
	public StudentInfo[] displayAll() {
		return pdao.findAll();
		
	}

	@Override
	public StudentInfo displayById(int id) {

		return pdao.findById(id);
	}

	@Override
	public StudentInfo displayByName(String name) {

		return pdao.findByName(name);
	}

	@Override
	public int calculateGpa(int id3) {

		return pdao.calculateGpa(id3);
	}

}
