# Documentação
Este projeto utiliza a configuração customizada do Spring Security por usuário e senha.

Execute o projeto e procure por "Using generated security password:" no log do console. Observe a senha gerada automaticamente para o usuário padrão "user".

Tente executar uma requisição ao recurso "/alo" e observe a resposta "401 Unauthorized":

curl -v http://localhost:8080/alo

Tente executar uma requisição ao recurso "/ola" e observe a resposta "200 OK":

curl -v http://localhost:8080/ola

Tente executar uma requisição ao recurso "/alo" fornecendo as credenciais informadas no log do console quando o projeto foi iniciado através de Basic Authentication e observe a resposta:

curl -v -u user:3b114a0a-10c1-4420-b963-039f5d5010d6 http://localhost:8080/alo
