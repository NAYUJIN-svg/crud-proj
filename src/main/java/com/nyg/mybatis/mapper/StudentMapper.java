package com.nyg.mybatis.mapper;

import java.util.List;


import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentMapper {
	
	List<Student> findAll();
// 	@Select("SELECT * FROM student WHERE id = #{id}")
//	Student findById(Long id);
	
	Student findById(Long id);
	
	
	void insert(Student student);
	
	
	void update(Student student);
	
	
	void delete(Long id);

}
