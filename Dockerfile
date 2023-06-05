FROM openjdk:20-jdk
COPY target/images-1.0-SNAPSHOT.jar images-1.0-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/images-1.0-SNAPSHOT.jar"]