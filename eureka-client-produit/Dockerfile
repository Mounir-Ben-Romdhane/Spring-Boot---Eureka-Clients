FROM openjdk:17
EXPOSE 8082
ADD target/eureka-client-0.0.1-SNAPSHOT.jar eureka-client.jar
ENTRYPOINT ["java","-jar","eureka-client.jar"]
