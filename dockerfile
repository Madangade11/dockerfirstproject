FROM eclipse-temurin:17-jdk-focal
ADD target/dockerfirstproject.jar dockerfirstproject.jar
EXPOSE 8282
ENTRYPOINT ["java","-jar", "/dockerfirstproject.jar"]