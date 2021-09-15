FROM openjdk:11

ARG DEPARTMENT_PROFILE
ENV DEPARTMENT_PROFILE=${DEPARTMENT_PROFILE}

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
CMD java -jar /app.jar --spring.profiles.active=${DEPARTMENT_PROFILE}