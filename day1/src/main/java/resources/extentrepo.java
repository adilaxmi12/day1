package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public  class extentrepo {
	static ExtentReports extent;
	public static ExtentReports getReporterObject() {
		String path=System.getProperty("user.dir")+"//reports//"+"index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Automation testing");
		reporter.config().setDocumentTitle("test results");
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "ADILAKSHMI");
		return extent;
		
		
		
		
	}

}
