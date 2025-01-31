# aumigo/
# │── src/
# │   ├── main/
# │   │   ├── java/com/geogodoy/aumigo/
# │   │   │   ├── AumigoApplication.java  # Classe principal do Spring Boot
# │   │   │   ├── config/                 # Configurações do projeto (CORS, Security, DB)
# │   │   │   ├── domain/                 # Entidades e lógica de domínio
# │   │   │   │   ├── model/               # Modelos de dados (Entidades JPA)
# │   │   │   │   ├── repository/          # Repositórios (interfaces JPA)
# │   │   │   ├── service/                 # Serviços (regras de negócio)
# │   │   │   │   ├── impl/                 # Implementações de serviços
# │   │   │   ├── controller/              # Controladores REST
# │   │   │   ├── dto/                     # Data Transfer Objects (DTOs)
# │   │   │   ├── exception/               # Tratamento de exceções personalizadas
# │   │   │   ├── security/                # Configuração de autenticação/autorização
# │   │   │   ├── util/                    # Classes utilitárias
# │   │   ├── resources/
# │   │   │   ├── application.properties   # Configurações do Spring Boot
# │   │   │   ├── schema.sql                # Script SQL inicial (se necessário)
# │   ├── test/                            # Testes automatizados
# │       ├── java/com/geogodoy/aumigo/
# │           ├── controller/              # Testes dos controllers
# │           ├── service/                 # Testes dos serviços
# │           ├── repository/              # Testes dos repositórios


Explicação das Pastas

1- domain/model/ → Armazena as entidades JPA (exemplo: Animal, Usuario, Voluntario).

2- domain/repository/ → Interfaces que estendem JpaRepository para acesso ao banco.

3- service/ → Camada de regras de negócio. Define contratos (interfaces) para serviços e suas implementações em impl/.

4- controller/ → Endpoints REST. Camada que expõe os serviços da aplicação.

5- dto/ → Objetos para transferência de dados, evitando expor diretamente as entidades.

6- exception/ → Centraliza exceções personalizadas para um melhor tratamento de erros.

7- security/ → Configuração de autenticação/autorização, como Spring Security e JWT.

8- util/ → Métodos auxiliares, como conversores de data e formatação.