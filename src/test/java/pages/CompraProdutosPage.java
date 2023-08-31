package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public  class CompraProdutosPage {
    WebDriver driver;

    public CompraProdutosPage(WebDriver driver){
        this.driver=driver;

    }

    public void acessar_site_e_commerce() {
    driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
    }


    public  void escolhe_mais_de_um_produto(){
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();


    }

    public  void remove_produto_do_carinho(){
        driver.findElement(By.id("shopping_cart_container")).click();
        driver.findElement(By.id("remove-sauce-labs-backpack")).click();

    }

    public  void qt_produtos_no_carinho(){
        String shoppingCartBadgeValue = driver.findElement(By.className("shopping_cart_badge")).getText();
        // Valor esperado
        String valorcarinho = "1";
        Assert.assertEquals(valorcarinho, shoppingCartBadgeValue);



    }

    public  void checkout(){
        driver.findElement(By.id("checkout")).click();
        driver.findElement(By.id("continue")).click();

    }

    public void  validar_checkout(){
        // Verificar a presença do botão de erro
        boolean isErrorButtonPresent = driver.findElements(By.className("error-button")).size() > 0;

        // Assert para verificar a presença do botão de erro
        Assert.assertTrue(isErrorButtonPresent);

    }


}