package steps;

import cucumber.api.java.pt.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.CompraProdutosPage;
import runner.RunCucumberTest;


public class Compras extends RunCucumberTest {
    CompraProdutosPage CompraProdutosPage = new CompraProdutosPage(driver);

    @Dados("^que o usuário está na página inicial do e-commerce$")
    public void acessar_site_e_commerce() {
        CompraProdutosPage.acessar_site_e_commerce();
    }



        @Quando("^o usuário seleciona um produto específico$")
        public void o_usuário_seleciona_um_produto_específico () {
            driver.findElement(By.id("item_4_title_link")).click();

        }

        @Quando("^adiciona o produto ao carrinho$")
        public void adiciona_o_produto_ao_carrinho () {
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

        }

        @Quando("^visualiza o conteúdo do carrinho$")
        public void visualiza_o_conteúdo_do_carrinho () {
            driver.findElement(By.id("shopping_cart_container")).click();

        }

        @Quando("^prossegue para o checkout$")
        public void prossegue_para_o_checkout () {
        driver.findElement(By.id("checkout")).click();
        driver.findElement(By.id("first-name")).sendKeys("QA");
        driver.findElement(By.id("last-name")).sendKeys("Automacao");
        driver.findElement(By.id("postal-code")).sendKeys("7415123");
        driver.findElement(By.id("continue")).click();



        }


        @Quando("^confirma a compra$")
        public void confirma_a_compra () {

            driver.findElement(By.id("finish")).click();

        }

        @Então("^a compra é concluída com sucesso$")
        public void a_compra_é_concluída_com_sucesso () {
            // Encontrar o elemento e obter o texto
            String thankYouMessage = driver.findElement(By.className("complete-header")).getText();

            // Valor esperado
            String valorEsperado = "Thank you for your order!"; // Substitua pelo valor desejado

            // Assert para verificar se o texto da compra corresponde ao valor esperado
            Assert.assertEquals(valorEsperado, thankYouMessage);


        }

    @Dado("^escolhe mais de um produto$")
    public void escolhe_mais_de_um_produto() {
       {CompraProdutosPage.escolhe_mais_de_um_produto();}


    }
    @Entao("^deve validar se diminuir quantidade de produtos no carrinho$")
    public  void qt_produtos_no_carinho() {
        {CompraProdutosPage.qt_produtos_no_carinho();}

    }


    @Dado("^remove um produto do carrinho$")
    public void remove_um_produto_do_carrinho()  {
        {CompraProdutosPage.remove_produto_do_carinho();}

    }

    @Quando("^nao informa os  para o checkout$")
    public void nao_informa_os_para_o_checkout()  {
        {CompraProdutosPage.checkout();}

    }

    @Entao("^recebo uma mensagem de erro$")
    public void recebo_uma_mensagem_de_erro() {
        {CompraProdutosPage.validar_checkout();}

    }






}
