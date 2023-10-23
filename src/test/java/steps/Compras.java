package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pages.CompraProdutosPage;
import runner.RunCucumberTest;


public class Compras extends RunCucumberTest {
    CompraProdutosPage CompraProdutosPage = new CompraProdutosPage(driver);

    @Dado("^que o usuário está na página inicial do e-commerce$")
    public void acessar_site_e_commerce() {
        CompraProdutosPage.acessar_site_e_commerce();
    }

    @Quando("^eu adiciono 3 unidades  Stylish Dress ao meu carrinho$")
    public void adicionar_Stylish_Dress() {
        CompraProdutosPage.adicionarStylishDress();
    }

    @Quando("^adiciono 2 unidades  Beautiful Peacock Blue Cotton Linen Saree$")
    public void adicionarBeautiful() {
        CompraProdutosPage.adicionarBeautiful();
    }


    @Quando("adiciono  1 unidade Men Tshirt$")
    public void adicionarMenTshirt() {
        CompraProdutosPage.adicionarMenTshirt();


    }

    @Entao("^vejo o total de cada produto de acordo com adicionado no carrinho$")
    public void validateProductDetails() {
        CompraProdutosPage.validateProductDetails();

    }
}