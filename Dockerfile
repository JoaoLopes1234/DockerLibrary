# Usar a imagem base do JDK
FROM openjdk:8-jdk-alpine

# Adicionar um argumento para receber o JAR file name
ARG JAR_FILE=target/*.jar

# Copiar o JAR file para o contêiner
COPY ${JAR_FILE} app.jar

# Expor a porta 8080
EXPOSE 8081

# Comando para executar a aplicação
ENTRYPOINT ["java", "-jar", "/app.jar"]

