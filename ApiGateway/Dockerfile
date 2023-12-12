FROM openjdk:11
EXPOSE 9000

ADD target/Gateway-0.0.1-SNAPSHOT.jar Gateway.jar
ENTRYPOINT ["java","-jar","Gateway.jar"]