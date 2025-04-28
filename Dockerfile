# Etapa 1: Construir o projeto usando Maven
FROM maven:3.9.9-eclipse-temurin-17 AS build

# Definir o diretório de trabalho
WORKDIR /app

# Copiar os arquivos do projeto para o container
COPY pom.xml .
COPY src ./src

# Executar o comando Maven para construir o JAR
RUN mvn clean package -DskipTests

# Etapa 2: Criar a imagem final com o JAR gerado
FROM openjdk:17-jdk-slim

# Definir o diretório de trabalho dentro do container
WORKDIR /app

# Copiar o JAR gerado na etapa anterior
COPY --from=build /app/target/aumigo-0.0.1-SNAPSHOT.jar app.jar

# Expor a porta que a aplicação usa
EXPOSE 8080

# Comando para executar a aplicação
ENTRYPOINT ["java", "-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:5005", "-jar", "app.jar"]

EXPOSE 8080 5005