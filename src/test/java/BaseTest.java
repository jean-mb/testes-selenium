import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class BaseTest extends Rota {
    @Test
    public void TesteWebDriver(){;
        chrome.findElement(By.name("q")).sendKeys("bricz venezuela"+ Keys.ENTER);
        String dado = chrome.findElement(By.id("result-stats")).getText();
        Assert.assertTrue(dado.contains("Aproximadamente"));
    }
}
