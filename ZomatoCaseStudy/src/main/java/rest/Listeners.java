/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package rest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.ccil.cowan.tagsoup.jaxp.SAXFactoryImpl;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

/**
 * @author Awanish Dwivedi
 * @version $Id: Listeners.java, v 0.1 2020-07-26 9:44 pm Awanish Dwivedi Exp $$
 */
public class Listeners implements ITestListener {
     ExtentTest extentTest;
     ExtentReports extentReports =  ReportClass.report();
     ThreadLocal<ExtentTest> safeTest = new ThreadLocal<ExtentTest>();

    @Override
    public void onTestStart(ITestResult result) {
        extentTest = extentReports.createTest(result.getMethod().getMethodName());
        safeTest.set(extentTest);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        safeTest.get().log(Status.PASS,"SUCCESS");

    }

    @Override
    public void onTestFailure(ITestResult result) {
        safeTest.get().fail(result.getThrowable());
    }

    @Override
    public void onTestSkipped(ITestResult result) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {

    }

    @Override
    public void onFinish(ITestContext context) {
        extentReports.flush();

    }
}