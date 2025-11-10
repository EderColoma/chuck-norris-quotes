FROM openjdk:11-ea-11-jdk-slim

WORKDIR /app

ARG JAR_FILE=target/chuck-norris-quotes-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} chuck-norris-quotes-0.0.1-SNAPSHOT.jar

EXPOSE 8088

ENTRYPOINT ["java", "-jar", "chuck-norris-quotes-0.0.1-SNAPSHOT.jar"]
