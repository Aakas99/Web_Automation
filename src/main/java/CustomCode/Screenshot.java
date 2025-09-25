package CustomCode;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.apache.commons.io.FileUtils;

// Assuming Driversetup is a class that manages the WebDriver instance
import Launchcode.Driversetup;

/**
 * Helper class to capture screenshots of a specific WebElement.
 * This class correctly handles file paths and exceptions.
 */
public class Screenshot extends Driversetup {
    
    // It's better to get the driver instance once in the method or from a static context
    // public WebDriver driver = Driversetup.getDriver();
    
    // Define the base destination directory as a class constant or a variable
    private static final Path DESTINATION_DIR = Paths.get("C://Users//spaak//OneDrive//Documents//ScratchUIbuild//Web_Automation//Web_Automation//Screenshots");

    /**
     * Captures a screenshot of the specified WebElement and saves it
     * to a file within the predefined screenshots directory.
     * @param element The WebElement to capture.
     * @param elementName A descriptive name for the element, used for the filename.
     */
    public void captureElementScreenshot(WebElement element, String elementName) {
        try {
            // Get the screenshot as a temporary file
            File screenshotFile = element.getScreenshotAs(OutputType.FILE);

            // Create a unique filename with a timestamp
            String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            String fileName = elementName + "_" + timestamp + ".png";

            // Construct the complete destination file path
            File destinationFile = new File(DESTINATION_DIR.toFile(), fileName);

            // Ensure the directory exists
            destinationFile.getParentFile().mkdirs();

            // Correctly copy the file from source to destination
            FileUtils.copyFile(screenshotFile, destinationFile);

            System.out.println("Screenshot saved to: " + destinationFile.getAbsolutePath());

        } catch (IOException e) {
            System.err.println("Failed to save screenshot: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
