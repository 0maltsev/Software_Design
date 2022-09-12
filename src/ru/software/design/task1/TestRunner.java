package ru.software.design.task1;
import org.junit.runner.notification.Failure;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class TestRunner {
    public static void main(String[] args){
        Result resultSquare = JUnitCore.runClasses(SquareTest.class);

        for (Failure failure : resultSquare.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(resultSquare.wasSuccessful());

        Result resultRectangle = JUnitCore.runClasses(RectangleTest.class);

        for (Failure failure : resultRectangle.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(resultRectangle.wasSuccessful());

        Result resultCircle = JUnitCore.runClasses(CircleTest.class);

        for (Failure failure : resultCircle.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(resultCircle.wasSuccessful());
    }
}
