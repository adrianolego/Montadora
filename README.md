## Proposta do projeto

Projeto no qual temos 3 aplicações onde 2 estão dentro do kubernetes e 1 outro fora.
Objetivo é estudos no Kubernetes ao exercitar a configuração, manupulação e uso dos comandos para controle dos containeres. 

![Alt text](Montadora-1.jpg)

## Pré requisitos
Rodar o docker compose na aplicação raiz para subir o banco de dados, subir as demais aplicações, chamar o endereço para retornar os dados http://localhost:8081/veiculo/v1

### Passos executados
- Criar 3 aplicações (bffvenda, servicevenda e montadora)
- Aplicação montadora conectada no banco mongo e já inserir 3 registros ao rodar
- Aplicação servicevenda conseguir chamar aplicação montadora e retornar os dados de veículos
- Aplicação bffvenda conseguir chamar aplicação servicevenda e retornar os dados de veículos
- Instalar minikube
  

### Passos a serem executados
 - Gerar imagens e subir no minikube
 - Conseguir retornar os dados com as duas aplicações rodando dentro do minikube e a aplicação montadora sendo acessada externamente
 - Implementar forma de testar as aplicações usando gatling
 - Implementar uso da programação reativa afim de melhorar as respostas
 - Implementar mais cenários para exercitar o uso da programação reativa