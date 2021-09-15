FROM openjdk:11

ARG USER_PROFILE
ENV USER_PROFILE=${USER_PROFILE}

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
CMD java -jar /app.jar --spring.profiles.active=${USER_PROFILE}