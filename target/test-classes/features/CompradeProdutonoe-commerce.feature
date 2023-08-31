#language:pt
@Tagcompras
Funcionalidade: Processo de Compra e Pagamento
  Eu como usuario e desejo compra um produto
  quero compra um produto
  Para realiza a compra via todos os pagamentos disponivel no site.

  Cenário: Compra bem-sucedida de um único produto
    Dado que o usuário está na página inicial do e-commerce
    Quando o usuário seleciona um produto específico
    E adiciona o produto ao carrinho
    E visualiza o conteúdo do carrinho
    E prossegue para o checkout
    E confirma a compra
    Então a compra é concluída com sucesso



  Cenário: Compra de produtos múltiplos no carrinho
    Dado que o usuário está na página inicial do e-commerce
    E escolhe mais de um produto
    E visualiza o conteúdo do carrinho
    E prossegue para o checkout
    E confirma a compra
    Então a compra é concluída com sucesso


  Cenário: Comprar produtos sem informa dados do checkout
    Dado que o usuário está na página inicial do e-commerce
    Quando o usuário seleciona um produto específico
    E adiciona o produto ao carrinho
    E visualiza o conteúdo do carrinho
    E  nao informa os  para o checkout
    Entao recebo uma mensagem de erro

  


