package BaseTest;

import PO.GooglePO;
import Rota.Rota;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Keys;

public class BaseTest extends Rota {

    public static GooglePO googlePage;

    @BeforeClass
    public static void paginaInit(){
        googlePage = new GooglePO(chrome);
    }

    @Test
    public void TesteWebDriver(){;
        googlePage.inputPesquisa.sendKeys("testes java"+ Keys.ENTER);
        String dado = googlePage.statsPesquisa.getText();
        Assert.assertTrue(dado.contains("Aproximadamente"));
    }
}
