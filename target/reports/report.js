$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CompradeProdutonoe-commerce.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language:pt"
    }
  ],
  "line": 2,
  "name": "Processo de Compra e Pagamento",
  "description": "Eu como usuario e desejo compra um produto\r\nquero compra um produto\r\nPara realiza a compra via todos os pagamentos disponivel no site.",
  "id": "processo-de-compra-e-pagamento",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "line": 7,
  "name": "Compra bem-sucedida de um único produto",
  "description": "",
  "id": "processo-de-compra-e-pagamento;compra-bem-sucedida-de-um-único-produto",
  "type": "scenario",
  "keyword": "Cenário"
});
formatter.step({
  "line": 8,
  "name": "que o usuário está na página inicial do e-commerce",
  "keyword": "Dado "
});
formatter.step({
  "line": 9,
  "name": "o usuário seleciona um produto específico",
  "keyword": "Quando "
});
formatter.step({
  "line": 10,
  "name": "adiciona o produto ao carrinho",
  "keyword": "E "
});
formatter.step({
  "line": 11,
  "name": "visualiza o conteúdo do carrinho",
  "keyword": "E "
});
formatter.step({
  "line": 12,
  "name": "prossegue para o checkout",
  "keyword": "E "
});
formatter.step({
  "line": 13,
  "name": "confirma a compra",
  "keyword": "E "
});
formatter.step({
  "line": 14,
  "name": "a compra é concluída com sucesso",
  "keyword": "Então "
});
formatter.match({
  "location": "Compras.acessar_site_e_commerce()"
});
formatter.result({
  "duration": 3452129900,
  "status": "passed"
});
formatter.match({
  "location": "Compras.o_usuário_seleciona_um_produto_específico()"
});
formatter.result({
  "duration": 86385800,
  "status": "passed"
});
formatter.match({
  "location": "Compras.adiciona_o_produto_ao_carrinho()"
});
formatter.result({
  "duration": 78061200,
  "status": "passed"
});
formatter.match({
  "location": "Compras.visualiza_o_conteúdo_do_carrinho()"
});
formatter.result({
  "duration": 65107900,
  "status": "passed"
});
formatter.match({
  "location": "Compras.prossegue_para_o_checkout()"
});
formatter.result({
  "duration": 614400100,
  "status": "passed"
});
formatter.match({
  "location": "Compras.confirma_a_compra()"
});
formatter.result({
  "duration": 66196400,
  "status": "passed"
});
formatter.match({
  "location": "Compras.a_compra_é_concluída_com_sucesso()"
});
formatter.result({
  "duration": 40508100,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Compra de produtos múltiplos no carrinho",
  "description": "",
  "id": "processo-de-compra-e-pagamento;compra-de-produtos-múltiplos-no-carrinho",
  "type": "scenario",
  "keyword": "Cenário"
});
formatter.step({
  "line": 19,
  "name": "que o usuário está na página inicial do e-commerce",
  "keyword": "Dado "
});
formatter.step({
  "line": 20,
  "name": "escolhe mais de um produto",
  "keyword": "E "
});
formatter.step({
  "line": 21,
  "name": "visualiza o conteúdo do carrinho",
  "keyword": "E "
});
formatter.step({
  "line": 22,
  "name": "prossegue para o checkout",
  "keyword": "E "
});
formatter.step({
  "line": 23,
  "name": "confirma a compra",
  "keyword": "E "
});
formatter.step({
  "line": 24,
  "name": "a compra é concluída com sucesso",
  "keyword": "Então "
});
formatter.match({
  "location": "Compras.acessar_site_e_commerce()"
});
formatter.result({
  "duration": 472362100,
  "status": "passed"
});
formatter.match({
  "location": "Compras.escolhe_mais_de_um_produto()"
});
formatter.result({
  "duration": 196729100,
  "status": "passed"
});
formatter.match({
  "location": "Compras.visualiza_o_conteúdo_do_carrinho()"
});
formatter.result({
  "duration": 81048500,
  "status": "passed"
});
formatter.match({
  "location": "Compras.prossegue_para_o_checkout()"
});
formatter.result({
  "duration": 523438000,
  "status": "passed"
});
formatter.match({
  "location": "Compras.confirma_a_compra()"
});
formatter.result({
  "duration": 83456100,
  "status": "passed"
});
formatter.match({
  "location": "Compras.a_compra_é_concluída_com_sucesso()"
});
formatter.result({
  "duration": 28979600,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "Comprar produtos sem informa dados do checkout",
  "description": "",
  "id": "processo-de-compra-e-pagamento;comprar-produtos-sem-informa-dados-do-checkout",
  "type": "scenario",
  "keyword": "Cenário"
});
formatter.step({
  "line": 28,
  "name": "que o usuário está na página inicial do e-commerce",
  "keyword": "Dado "
});
formatter.step({
  "line": 29,
  "name": "o usuário seleciona um produto específico",
  "keyword": "Quando "
});
formatter.step({
  "line": 30,
  "name": "adiciona o produto ao carrinho",
  "keyword": "E "
});
formatter.step({
  "line": 31,
  "name": "visualiza o conteúdo do carrinho",
  "keyword": "E "
});
formatter.step({
  "line": 32,
  "name": "nao informa os  para o checkout",
  "keyword": "E "
});
formatter.step({
  "line": 33,
  "name": "recebo uma mensagem de erro",
  "keyword": "Entao "
});
formatter.match({
  "location": "Compras.acessar_site_e_commerce()"
});
formatter.result({
  "duration": 410133600,
  "status": "passed"
});
formatter.match({
  "location": "Compras.o_usuário_seleciona_um_produto_específico()"
});
formatter.result({
  "duration": 103754500,
  "status": "passed"
});
formatter.match({
  "location": "Compras.adiciona_o_produto_ao_carrinho()"
});
formatter.result({
  "duration": 90893000,
  "status": "passed"
});
formatter.match({
  "location": "Compras.visualiza_o_conteúdo_do_carrinho()"
});
formatter.result({
  "duration": 87762400,
  "status": "passed"
});
formatter.match({
  "location": "Compras.nao_informa_os_para_o_checkout()"
});
formatter.result({
  "duration": 169715100,
  "status": "passed"
});
formatter.match({
  "location": "Compras.recebo_uma_mensagem_de_erro()"
});
formatter.result({
  "duration": 37645800,
  "status": "passed"
});
});