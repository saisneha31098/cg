
package com.demo;

//import static org.assertj.core.api.Assertions.assertThat;
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

import com.demo.controllers.AdminController;
import com.demo.dtos.Admin;
import com.demo.service.AdminService;

@ExtendWith(MockitoExtension.class)
public class AdminControllerTest {
	
	private MockMvc mockMvc;
	@Mock
	AdminService adminServices;
	

	@InjectMocks
	AdminController adminController;

	@Test
	public void testAddAdmin() {
		
		Admin admin=new Admin();
		        Mockito.when(adminController.addAdmin(admin)).thenReturn(admin);
		        assertEquals(admin,adminController.addAdmin(admin));
		        System.out.println("testAddAdmin");
		    }
	 @Test
	    public void testGetAll() {
	        List<Admin> admin=new ArrayList<Admin>();
	       Mockito.when(adminController.getAdmin()).thenReturn(admin);
	        assertEquals(admin,adminController.getAdmin());
	        System.out.println("testGetAllAdminById");

	    }
	 
	 @Test
		void testAdminById() {
			Admin admin= new Admin();
			 Long id=1L;
			Mockito.when(adminController.getAdminById(id)).thenReturn(admin);
			assertEquals(admin, adminController.getAdminById(id));
			System.out.println("testGetAdminById");
		}
	 @Test
		void testremoveAdminById() {
		 Admin admin=new Admin();
			 Long id=1L;
			 Mockito.when(adminController.removeAdminById(id)).thenReturn(admin);
		     assertEquals(admin,adminController.removeAdminById(id));
		     System.out.println("testRemoveAdminById");
		}
				@Test
				 public void testUpdateAdminById() {
					Admin admin=new Admin();
					 Long id=1L;
					 Mockito.when(adminController.getAdminById(id)).thenReturn(admin);
				        assertEquals(admin,adminController.getAdminById(id));
				        System.out.println("testUpdateAdminById");
				}
			
		 
	 }

