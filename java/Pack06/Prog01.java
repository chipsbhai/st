package Pack06;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Prog01 implements ITestListener {
	public void onTestStart(ITestResult result) {
		System.out.println("Test case execution is going to start");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case execution is paused");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test case execution is skipped");
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case execution skipped");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Test case execution failed withing percentage range");
	}

	public void onStart(ITestResult result) {
		System.out.println("Before everything");
	}

	public void onFinish(ITestResult result) {
		System.out.println("After everything");
	}

}
