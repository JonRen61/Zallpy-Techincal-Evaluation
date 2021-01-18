# zallpy-technical-evaluation

> Sobre a aplicação: 
>> A aplicação foi construída utilizando SpringBoot 2.4.1 e Java na versão 1.8. A base de dados é do tipo H2 embedded com volume de gravação em arquivo, ou seja, não é excluída na finalização da execução do app. 

> Instruções de uso: 
>> Para executar a aplicação basta executar a classe 'TechnicalEvaluationApplication' como Java application.
A API será executada por defaul na porta 8081 definida no arquivo application.properties em resources, pode ser alterada editando a propriedade 'server.port'.
O console da base H2 pode ser consultado adicionando '/console' no final do endereço de execução padrão da aplicação, o usuário é 'sa' e a senha está em branco.