FROM openjdk:8-jre-alpine
COPY build/libs/*.jar application.jar
EXPOSE 8084
CMD ["java", "-jar", "application.jar"]