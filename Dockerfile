# Etapa 1: Compilar el proyecto
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Etapa 2: Ejecutar el JAR
FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=build /app/target/INSTITUCION-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8090
ENV PORT=8090
ENTRYPOINT ["java", "-jar", "app.jar", "--server.port=${PORT}"]

