/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel;

/**
 *
 * @author bhara
 */
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
    public static void main(String[] args) {
          System.out.println();
          Result result = JUnitCore.runClasses(Login.class);
          for (Failure failure : result.getFailures()) {
          }
          System.out.println(result.wasSuccessful());
}
}
