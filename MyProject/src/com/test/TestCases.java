package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCases {

	@Test
	void test() {
		
		TestClass test = new TestClass();
		String output =TestClass.formattedEquationOfNaturalNumbers(1,10);
		assertEquals("3+5+6+9+ : 23", output);
		
	
	}

}
/**
 *  
Member/Physician Data Model
How would you model the following?

A Member has an ID, First and Last Name.
A Physician has an ID, First Name, Last Name, and one or more Specialty.
A Member has a Primary Care Physician.
A Member can Visit a Physician one or more times on a given date and time with a specific Reason.

Members
M_ID	F_Name L_Name P_ID


Physicians
P_ID    F_Name L_Name  Specialities


Appointments

M_ID P_ID  Date  Time  SpecificReasons


Specialty
S_ID	P_ID   Specialties


Physician
p_id, fname, lname 

Specialty
s_id, name

PhysicianSpecialties
p_id, s_id  





























*/