# Stage 1: Build the application
FROM maven:3.8.4-openjdk-17 AS builder
WORKDIR /app
COPY ./src ./src
COPY ./pom.xml .
RUN mvn clean package -Dmaven.test.skip=true

# Stage 2: Create the final image
FROM openjdk:17-jdk-alpine
WORKDIR /app
VOLUME /tmp
COPY --from=builder /app/target/*.jar gateway.jar
ENTRYPOINT ["java", "-jar", "/app/gateway.jar"]