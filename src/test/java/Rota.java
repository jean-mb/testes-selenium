import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class Rota {
    protected static WebDriver chrome;

    @BeforeClass
    public static void iniciar(){
        chrome = new ChromeDriver();
        chrome.manage().window().maximize();
        chrome.get("https://google.com");
    }

    @AfterClass
    public static void finalizar(){
        chrome.quit();
    }
}
