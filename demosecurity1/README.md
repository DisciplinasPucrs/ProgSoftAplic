# Documentação
Este projeto utiliza a configuração padrão do Spring Security que é autenticação por usuário e senha.

Execute o projeto e procure por "Using generated security password:" no log do console. Observe a senha gerada automaticamente para o usuário padrão "user".

Tente executar uma requisição ao recurso "/alo" e observe a resposta "401 Unauthorized":

curl -v http://localhost:8080/alo

Tente executar a mesma requisição em um navegador web e observe a página de login gerada pelo framework.

Tente executar uma requisição ao recurso "/alo" fornecendo as credenciais informadas no log do console quando o projeto foi iniciado através de Basic Authentication e observe a resposta:

curl -v -u user:efc2af20-ae4c-478c-8aff-ed1529d0bc75 http://localhost:8080/alo
