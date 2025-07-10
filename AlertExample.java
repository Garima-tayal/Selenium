import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.Alert;

public class AlertExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge", "C:\\Users\\Welcome\\Downloads\\edgedriver_win64");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");

        driver.switchTo().frame("iframeResult");

        driver.findElement(By.tagName("button")).click();

        Alert alert = driver.switchTo().alert();

        System.out.println("Alert message: " + alert.getText());

        alert.accept();

        try { Thread.sleep(100); } catch (InterruptedException e) {}
        driver.quit();
    }
}
