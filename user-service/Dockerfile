FROM openjdk:8-jre-alpine
COPY build/libs/*.jar application.jar
EXPOSE 8081
CMD ["java", "-jar", "application.jar"]