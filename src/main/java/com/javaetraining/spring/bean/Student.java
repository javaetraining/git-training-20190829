package com.javaetraining.spring.bean;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component // <bean id = "student" class ="com.javaetraining.spring.bean.Student"/>
public class Student {

//	@Resource(name = "id")
//		or
	@Autowired(required = true)
	@Qualifier("id1")
	private Integer id;
	private String firstName;
	private String lastName;
	private String course;

//	@Autowired
//	@Qualifier("addressList")
//			or
	@Resource(name= "addressList")
	private List<Address> addressList;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public List<Address> getAddressList() {
		return addressList;
	}

	public void setAddressList(List<Address> addressList) {
		this.addressList = addressList;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName="
				+ lastName + ", course=" + course + ", addressList="
				+ addressList + "]";
	}

}
