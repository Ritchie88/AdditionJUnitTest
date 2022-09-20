package project;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;



public class TestRunner {
    public static void main(String[] args){
        Addition add = new Addition();

        //Run All Test Suites
        Result result = JUnitCore.runClasses(TestSuite.class);

        System.out.println(
                "All Tests Passed: " + result.wasSuccessful() +
                "\nTests That Passed: " + (result.getRunCount() - result.getFailureCount()) +
                "\nTests That Failed: " + result.getFailureCount());
    }
}
