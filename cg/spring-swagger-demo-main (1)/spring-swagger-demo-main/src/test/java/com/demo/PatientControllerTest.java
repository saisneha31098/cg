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

import com.demo.controllers.PatientController;
import com.demo.dtos.Patient;
import com.demo.service.PatientService;

@ExtendWith(MockitoExtension.class)
public class PatientControllerTest {

	private MockMvc mockMvc;
	@Mock
	PatientService patientServices;

	@InjectMocks
	PatientController patientController;
	
	@Test
	public void testAddPatient() {
		
		Patient patient=new Patient();
		        Mockito.when(patientController.addPatient(patient)).thenReturn(patient);
		        assertEquals(patient,patientController.addPatient(patient));
		        System.out.println("testAddPatient");
		    }
	 @Test
	    public void testGetAllPatients() {
	        List<Patient> patient=new ArrayList<Patient>();
	       Mockito.when(patientController.getHospitalPatients()).thenReturn(patient);
	        assertEquals(patient,patientController.getHospitalPatients());
	        System.out.println("testGetAllPatient");

	    }
	 @Test
		void testPatientById() {
			Patient patient= new Patient();
			Long id = 1L;
			Mockito.when(patientController.getPatientById(id)).thenReturn(patient);
			assertEquals(patient, patientController.getPatientById(id));
			System.out.println("testGetPatientById");
			
		}

	@Test
	void testremovePatient() {
		Patient patient=new Patient();
		 Long id=1L;
		 Mockito.when(patientController.removePatientById(id)).thenReturn(patient);
	     assertEquals(patient,patientController.removePatientById(id));
	    System.out.println("testRemovePatientById");
	}
	@Test
	 public void testUpdatePatientById() {
		 Patient patient=new Patient();
		 Long id=1L;
		 Mockito.when(patientController.getPatientById(id)).thenReturn(patient);
	        assertEquals(patient,patientController.getPatientById(id));
	        System.out.println("testUpdatePatientById");
	}
	
	 
	
}