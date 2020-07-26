/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package rest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

/**
 * @author Awanish Dwivedi
 * @version $Id: ExtentReport.java, v 0.1 2020-07-26 9:38 pm Awanish Dwivedi Exp $$
 */
public class ReportClass {
    static ExtentReports extentReports;

    public static ExtentReports report(){
        String path = System.getProperty("user.dir")+"/reports/index.html";
        ExtentSparkReporter reporter = new ExtentSparkReporter(path);
        reporter.config().setReportName("ZomatoApiCaseStudy");
        reporter.config().setDocumentTitle("Test Report");

        extentReports = new ExtentReports();
        extentReports.attachReporter(reporter);
        extentReports.setSystemInfo("Tester", "Awanish Dwivedi");
        return extentReports;
     }

}