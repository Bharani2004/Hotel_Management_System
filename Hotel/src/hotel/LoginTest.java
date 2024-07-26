/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel;

/**
 *
 * @author bhara
 */
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class LoginTest {
public String emailPattern = "^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$";

public LoginTest()
{
}
@BeforeClass
public static void setUpClass() {
}
@AfterClass
public static void tearDownClass() {
}
@Before
public void setUp() {
}
@After
public void tearDown() {
}
/**
* Test of clear method, of class Login.
*/
@Test
public void testClear() {
System.out.println("clear");
Login instance = new Login();
instance.clear();
// TODO review the generated test code and remove the default call to fail.
//fail("The test case is a prototype.");
}
/**
* Test of getText method, of class Login.
*/
@Test
public void testGetText()throws Exception {
System.out.println("getText");
Login instance = new Login();
String email1 = "jayasree@gmail.com";
String password1 = "J1a2y3a4@";
String exp="jayasree@gmail.com";
String pas="J1a2y3a4@";
instance.getText(email1, password1);
assertEquals(exp,email1);
assertEquals(pas, password1);
//Login instance = new Login();
// TODO review the generated test code and remove the default call to fail.
//fail("The test case is a prototype.");
}
/**
* Test of validateFields method, of class Login.
*/
@Test
public void testValidateFields()throws Exception {
System.out.println("validateFields");
Login instance = new Login();
instance.validateFields();
// TODO review the generated test code and remove the default call to fail.
//fail("The test case is a prototype.");
}
/**
* Test of main method, of class Login.
*/
@Test
public void testMain() {
System.out.println("main");
String[] args = null;
Login.main(args);
// TODO review the generated test code and remove the default call to fail.
//fail("The test case is a prototype.");
}
}
