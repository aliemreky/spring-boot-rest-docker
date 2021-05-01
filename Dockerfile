#JDK
FROM adoptopenjdk:8-jre-hotspot

#Project Structure and Extract Jar
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} springdocker.jar

#Port
EXPOSE 9980

#Start Project
ENTRYPOINT ["java","-jar","/springdocker.jar"]