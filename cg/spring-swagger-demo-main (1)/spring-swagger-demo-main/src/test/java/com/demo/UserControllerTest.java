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

	import com.demo.controllers.UserController;
	import com.demo.dtos.User;
	import com.demo.service.UserService;



	@ExtendWith(MockitoExtension.class)
	public class UserControllerTest {

		private MockMvc mockMvc;
		
		@Mock
		UserService userService;
		
		@InjectMocks
		UserController userController;
		

		@Test
		public void testAddUser() {
			
			User user=new User();
			        Mockito.when(userController.addUser(user)).thenReturn(user);
			        assertEquals(user,userController.addUser(user));
			        System.out.println("testAddUserById");
			    }
		@Test
	    public void testGetAllUsers() {
	    List<User> user=new ArrayList<User>();
	       Mockito.when(userController.getUsers()).thenReturn(user);
	        assertEquals(user,userController.getUsers());
	        System.out.println("testGetAllUserById");

	    }
		@Test
		 public void testUpdateUserById() {
			 User user=new User();
			 Long id=1L;
			 Mockito.when(userController.getUserById(id)).thenReturn(user);
		        assertEquals(user,userController.getUserById(id));
		        System.out.println("testUpdateUserById");
		}
		@Test
		void testUserById() {
			User user= new User();
			Long id = 1L;
			Mockito.when(userController.getUserById(id)).thenReturn(user);
			assertEquals(user, userController.getUserById(id));
			System.out.println("testGetUserById");		
		}
		@Test
		void testdeleteUser() {
			User user=new User();
			 Long id=1L;
			 Mockito.when(userController.removeUser(id)).thenReturn(user);
		     assertEquals(user,userController.removeUser(id));
		     System.out.println("testRemoveUserById");
		}
	}


