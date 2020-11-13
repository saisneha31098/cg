package com.demo;


import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.MockMvc;
import com.demo.controllers.DoctorController;
import com.demo.dtos.Doctor;
import com.demo.service.DoctorService;

@ExtendWith(MockitoExtension.class)
public class DoctorControllerTest {

	private MockMvc mockMvc;
	@Mock
	DoctorService doctorServices;
	@InjectMocks
	DoctorController doctorController;

	@Test
	public void testAddDoctor() {
		
		Doctor doctor=new Doctor();
		        Mockito.when(doctorController.addDoctor(doctor)).thenReturn(doctor);
		        assertEquals(doctor,doctorController.addDoctor(doctor));
		        System.out.println("testAddDoctor");
		    }
	@Test
    public void testGetAllDoctors() {
        List<Doctor> doctor=new ArrayList<Doctor>();
       Mockito.when(doctorController.getHospitalDoctors()).thenReturn(doctor);
        assertEquals(doctor,doctorController.getHospitalDoctors());
        System.out.println("testGetAllDoctors");
    }
	@Test
	void testgetDoctorById() {
		Doctor doctor= new Doctor();
		Long id = 1L;
		Mockito.when(doctorController.getDoctorById(id)).thenReturn(doctor);
		assertEquals(doctor, doctorController.getDoctorById(id));
		System.out.println("testgetDoctorById");
	}
	
	@Test
	void testremoveDoctor() {
		 Doctor doctor=new Doctor();
		 Long id=1L;
		 Mockito.when(doctorController.removeDoctorById(id)).thenReturn(doctor);
	     assertEquals(doctor,doctorController.removeDoctorById(id));
	     System.out.println("testremoveDoctor");
	}
	
	@Test
	 public void testUpdateDoctorById() {
		 Doctor doctor=new Doctor();
		 Long id=1L;
		 Mockito.when(doctorController.getDoctorById(id)).thenReturn(doctor);
	        assertEquals(doctor,doctorController.getDoctorById(id));
	        System.out.println("testUpdateDoctorById");
	}
	
}