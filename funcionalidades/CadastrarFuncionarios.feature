#language: pt
#encoding: iso-8859-1

Funcionalidade: Cadastrar Funcionário

Cenário: Cadastro de funcionário com sucesso

Dado Acessar a página de cadastro de funcionário
E Informar o nome do funcionário "Alcino Alves da Silva Neto" 
E Informar o CPF do funcionário "029.485.752-02"
E Informar a data de admissão do funcionário "25/06/2021"
E Informar o resumo de atividades "Analista de Sistemas"
Quando Solicitar o cadastro
Então Sistema informa que cadastro realizado com sucesso

Cenário: Validação de campos obrigatórios
Dado Acessar a página de cadastro de funcionário
Quando Solicitar o cadastro
Então Sistema informa que todos os campos são obrigatórios



