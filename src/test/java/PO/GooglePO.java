package PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePO extends BasePO{
    @FindBy(name = "q")
    public WebElement inputPesquisa;
    @FindBy(id = "result-stats")
    public WebElement statsPesquisa;

    public GooglePO(WebDriver chrome){
        super(chrome);
    }
}
