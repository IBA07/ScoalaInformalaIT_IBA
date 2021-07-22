package Utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.Platform;

import java.io.File;

public class ExtentManager {

    private static ExtentReports extent;
    private static Platform platform;
    private static String reportFilename = "Test_Automation_report.html";
    private static String windowsPath = System.getProperty("user.dir") + "\\TestReport";
    private static String winReportFileLocation = windowsPath + "\\" + reportFilename;

    private static ExtentReports getInstance() {
        if (extent == null) {
            createInstance();
        }
        return extent;
    }

    private static void createInstance() {
        String fileName = getReportLocation();
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(fileName);

    }

    private static String getReportLocation() {
        String reportLocation = null;
        reportLocation = winReportFileLocation;
        createReportPath(windowsPath);
        System.out.println("Report location " + windowsPath);
        return reportLocation;
    }

    private static void createReportPath(String windowsPath){
        File dir = new File (windowsPath);
        if (!dir.exists()) {
            if (dir.mkdir()) {
                System.out.println("Folder was created successfully for the report !");
            }
            else {
                System.out.println("Fail to create folder for report");
            }
        }
        else {
            System.out.println("The folder already exists on the disk");
        }
    }


}
