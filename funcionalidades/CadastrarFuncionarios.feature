#language: pt
#encoding: iso-8859-1

Funcionalidade: Cadastrar Funcion�rio

Cen�rio: Cadastro de funcion�rio com sucesso

Dado Acessar a p�gina de cadastro de funcion�rio
E Informar o nome do funcion�rio "Alcino Alves da Silva Neto" 
E Informar o CPF do funcion�rio "029.485.752-02"
E Informar a data de admiss�o do funcion�rio "25/06/2021"
E Informar o resumo de atividades "Analista de Sistemas"
Quando Solicitar o cadastro
Ent�o Sistema informa que cadastro realizado com sucesso

Cen�rio: Valida��o de campos obrigat�rios
Dado Acessar a p�gina de cadastro de funcion�rio
Quando Solicitar o cadastro
Ent�o Sistema informa que todos os campos s�o obrigat�rios



