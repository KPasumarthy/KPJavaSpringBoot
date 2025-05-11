# Stage 1: Build the application
# FROM maven:3.8.6-jdk-11 AS builder
# FROM maven:ms-17.0.15 AS builder
FROM maven:3.8.3-openjdk-17 AS builder
WORKDIR /app
COPY pom.xml .
COPY src ./src
#RUN mvn clean install -DskipTests
RUN mvn clean install compile

# Stage 2: Create the runtime image
#FROM openjdk:11-jre-slim
#FROM openjdk:ms-17.0.15
FROM maven:3.8.3-openjdk-17
WORKDIR /app
COPY --from=builder /app/target/classes ./
EXPOSE 8181
#CMD ["java", "org.springframework.boot.loader.JarLauncher"]
#CMD ["java", "com.mycompany.project.MyApplication"]
#CMD ["java", "com.kpjavaspringboot.KPJavaSpringBootApplication"]
#CMD ["java", "KPJavaSpringBootApplication"]
CMD ["java", "com.kpjavaspringboot.KPJavaSpringBootApplication"]

