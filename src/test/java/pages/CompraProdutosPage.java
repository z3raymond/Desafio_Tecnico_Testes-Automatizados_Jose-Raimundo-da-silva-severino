package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

public  class CompraProdutosPage {
    WebDriver driver;

    public CompraProdutosPage(WebDriver driver) {
        this.driver = driver;

    }



    public void acessar_site_e_commerce() {
        driver.get("https://automationexercise.com/");
        driver.findElement(By.xpath("//*[@id='header']/div/div/div/div[2]/div/ul/li[4]/a/i")).click();
        driver.findElement(By.name("email")).sendKeys("de982013@gmail.com.Qa");
        driver.findElement(By.name("password")).sendKeys("qa123");
        driver.findElement(By.cssSelector("button[data-qa='login-button']")).click();

    }


    public void adicionarStylishDress() {
        for (int i = 0; i < 3; i++) {
            // Encontrar o elemento <a> pelo atributo data-product-id
            WebElement addToCartButton = driver.findElement(By.cssSelector("a[data-product-id='4']"));

            // Rolar até o elemento ser visível
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", addToCartButton);

            // Aguardar um momento para garantir que o elemento esteja visível
            try {
                Thread.sleep(1000); // Pausa de 1 segundo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Clicar no elemento "Add to cart"
            addToCartButton.click();

            try {
                Thread.sleep(1000); // Pausa de 1 segundo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Encontrar o botão "Continue Shopping" no modal
            WebElement continueShoppingButton = driver.findElement(By.cssSelector("div.modal-footer button.btn.btn-success.close-modal.btn-block[data-dismiss='modal']"));

            // Clicar no botão para fechar o modal
            continueShoppingButton.click();

            // Aguardar um momento entre os cliques
            try {
                Thread.sleep(1000); // Pausa de 1 segundo entre os cliques
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Após adicionar Stylish Dress, clique no elemento "Cart"
      WebElement cartLink = driver.findElement(By.cssSelector("a[href='/view_cart']"));
       cartLink.click();

        // Mapear o elemento usando a tag <a> e seu link de atributo href
        WebElement products = driver.findElement(By.xpath("//a[@href='/products']"));

        // Clicar no elemento
      products.click();



    }



    public void adicionarBeautiful() {
        for (int i = 0; i < 2; i++) {
            // Encontrar o elemento <a> pelo atributo data-product-id
            WebElement addToCartButton = driver.findElement(By.cssSelector("a[data-product-id='41']"));

            // Rolar até o elemento ser visível
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", addToCartButton);

            // Aguardar um momento para garantir que o elemento esteja visível
            try {
                Thread.sleep(1000); // Pausa de 1 segundo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Clicar no elemento "Add to cart"
            addToCartButton.click();

            try {
                Thread.sleep(1000); // Pausa de 1 segundo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Encontrar o botão "Continue Shopping" no modal
            WebElement continueShoppingButton = driver.findElement(By.cssSelector("div.modal-footer button.btn.btn-success.close-modal.btn-block[data-dismiss='modal']"));

            // Clicar no botão para fechar o modal
            continueShoppingButton.click();

            // Aguardar um momento entre os cliques
            try {
                Thread.sleep(1000); // Pausa de 1 segundo entre os cliques
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Após adicionar , clique no elemento "Cart"
       WebElement cartLink = driver.findElement(By.cssSelector("a[href='/view_cart']"));
      cartLink.click();


    }




    public void adicionarMenTshirt() {
        {
            // Encontrar o elemento <a> pelo atributo data-product-id
            WebElement addToCartButton = driver.findElement(By.cssSelector("a[data-product-id='2']"));

            // Rolar até o elemento ser visível
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", addToCartButton);

            // Aguardar um momento para garantir que o elemento esteja visível
            try {
                Thread.sleep(1000); // Pausa de 1 segundo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Clicar no elemento "Add to cart"
            addToCartButton.click();

            try {
                Thread.sleep(1000); // Pausa de 1 segundo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Encontrar o botão "Continue Shopping" no modal
            WebElement continueShoppingButton = driver.findElement(By.cssSelector("div.modal-footer button.btn.btn-success.close-modal.btn-block[data-dismiss='modal']"));

            // Clicar no botão para fechar o modal
            continueShoppingButton.click();

            // Aguardar um momento entre os cliques
            try {
                Thread.sleep(1000); // Pausa de 1 segundo entre os cliques
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Após adicionar , clique no elemento "Cart"
        WebElement cartLink = driver.findElement(By.cssSelector("a[href='/view_cart']"));
        cartLink.click();


    }


    public void validateProductDetails() {
        // Encontrar os elementos <a> com os textos dos produtos
        WebElement linkStylishDress = driver.findElement(By.xpath("//a[text()='Stylish Dress']"));
        WebElement linkSaree = driver.findElement(By.xpath("//a[text()='Beautiful Peacock Blue Cotton Linen Saree']"));
        WebElement linkTshirt = driver.findElement(By.xpath("//a[text()='Men Tshirt']"));

        // Encontrar os elementos <button> com a classe "disabled"
        WebElement buttonStylishDress = driver.findElement(By.xpath("//a[text()='Stylish Dress']/following-sibling::button[@class='disabled']"));
        WebElement buttonSaree = driver.findElement(By.xpath("//a[text()='Beautiful Peacock Blue Cotton Linen Saree']/following-sibling::button[@class='disabled']"));
        WebElement buttonTshirt = driver.findElement(By.xpath("//a[text()='Men Tshirt']/following-sibling::button[@class='disabled']"));

        // Obter os textos dos elementos <a>
        String stylishDressName = linkStylishDress.getText();
        String sareeName = linkSaree.getText();
        String tshirtName = linkTshirt.getText();

        // Obter os textos dos elementos <button>
        int stylishDressQuantity = Integer.parseInt(buttonStylishDress.getText());
        int sareeQuantity = Integer.parseInt(buttonSaree.getText());
        int tshirtQuantity = Integer.parseInt(buttonTshirt.getText());

        // Validar os detalhes dos produtos (nome e quantidade)
        assertEquals("Stylish Dress", stylishDressName, "O nome do Stylish Dress não corresponde.");
        assertEquals(String.valueOf(3), stylishDressQuantity, "A quantidade de Stylish Dress não corresponde.");

        assertEquals("Beautiful Peacock Blue Cotton Linen Saree", sareeName, "O nome do Saree não corresponde.");
        assertEquals(String.valueOf(2), sareeQuantity, "A quantidade de Saree não corresponde.");

        assertEquals("Men Tshirt", tshirtName, "O nome do Tshirt não corresponde.");
        assertEquals(String.valueOf(1), tshirtQuantity, "A quantidade de Tshirt não corresponde.");
    }




}
