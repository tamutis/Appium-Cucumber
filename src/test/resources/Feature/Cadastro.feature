# language: pt
# encoding: iso-8859-1
#Autor: Andre Luiz Tamutis
@cadastro
Funcionalidade: Validar apk de Cadasto de cliente

  @cadastroCliente
  Cenário: Cadastrar cliente com Sucesso
    Dado clicar em cadastro novo
    Quando informar os dados do cliente
    Então salvo
    E validado se o cliete foi salvo corretamente

  @exportar
  Cenário: exportar 
    Dado clicar em exportar dados
    Quando exporto em Excel
    Então valida a mensagem de arquivo salvo

  @excluir
  Cenário: excluir Usuario
    Dado clico em pesquisa
    Quando localizar o Cliente
    Então excluir
   