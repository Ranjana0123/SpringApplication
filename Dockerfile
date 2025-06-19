FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY target/*.jar springtest.jar
ENTRYPOINT ["java", "-jar", "springtest.jar"]