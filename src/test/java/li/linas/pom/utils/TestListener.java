package li.linas.pom.utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestListener implements ITestListener {
    @Override
    public void onTestFailure(ITestResult result) {
        takeScreenShot();
    }

    private void takeScreenShot() {
        TakesScreenshot takesScreenshot = (TakesScreenshot) Driver.getDriver();
        File screenchotFile = takesScreenshot.getScreenshotAs(OutputType.FILE);

        String dir = "./screenshots/";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd_HH_mm_SSS");
        String date = LocalDateTime.now().format(formatter);

        String fileName = "screenshot_" + date + ".png";
        File copyToFile = new File("%s%s".formatted(dir, fileName));

        try {
            FileUtils.copyFile(screenchotFile, copyToFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
