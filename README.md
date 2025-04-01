# aumigo/


Explicação das Pastas

1- domain/model/ → Armazena as entidades JPA (exemplo: Animal, Usuario, Voluntario).

2- domain/repository/ → Interfaces que estendem JpaRepository para acesso ao banco.

3- service/ → Camada de regras de negócio. Define contratos (interfaces) para serviços e suas implementações em impl/.

4- controller/ → Endpoints REST. Camada que expõe os serviços da aplicação.

5- dto/ → Objetos para transferência de dados, evitando expor diretamente as entidades.

6- exception/ → Centraliza exceções personalizadas para um melhor tratamento de erros.

7- security/ → Configuração de autenticação/autorização, como Spring Security e JWT.

8- util/ → Métodos auxiliares, como conversores de data e formatação.


# Padrões de projeto aplicados

1. Service Layer Pattern (Separação de Responsabilidades)
   Os controladores REST não devem conter regras de negócio. Essa lógica deve ser isolada nos serviços, tornando o código mais limpo e testável.
2. DTO Pattern (Data Transfer Object)
   Evita expor diretamente as entidades JPA nas respostas dos endpoints. Os DTOs são objetos simples que contêm apenas os dados necessários para a comunicação.
3. Repository Pattern (Acesso a Dados)
   Repositórios são interfaces que estendem JpaRepository, permitindo acesso ao banco de dados de forma mais simples e sem a necessidade de escrever queries SQL.
   obs: O Spring Data JPA que está sendo usado nesse projeto já segue o Repository Pattern, pois ele separa a camada de persistência da lógica de negócios ao definir interfaces que estendem JpaRepository ou CrudRepository.
4. Strategy Pattern (Injeção de Dependências)
   As implementações de serviços são injetadas nos controladores por meio de interfaces, permitindo a troca de implementação sem alterar o código que as utiliza.


Maven 
para baixar as dependências do projeto, execute o comando mvn clean install no diretório raiz do projeto: mvn clean install -s settings.xmlmvn -version
trocar java_home para 17

