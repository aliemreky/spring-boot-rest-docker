#JAVA JDK
FROM openjdk:8

# copy jar in target to put the file in container usr/src folder
ADD ./target/spring-docker-0.0.1-SNAPSHOT.jar /usr/src/spring-docker-0.0.1-SNAPSHOT.jar

# Set Workspace Location
WORKDIR usr/src

# Run Command
ENTRYPOINT ["java","-jar", "spring-docker-0.0.1-SNAPSHOT.jar"]