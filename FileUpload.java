import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FileUpload {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge", "C:\\Users\\Welcome\\Downloads\\edgedriver_win64");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.w3schools.com/howto/howto_html_file_upload_button.asp");

        WebElement upload = driver.findElement(By.xpath("//input[@type='file']"));

        upload.sendKeys("C:\\Users\\Welcome\\Desktop\\set_interface.pdf");

        System.out.println("File uploaded successfully!");

        try { Thread.sleep(2000); } catch (InterruptedException e) {}
        driver.quit();
        
    }
}

