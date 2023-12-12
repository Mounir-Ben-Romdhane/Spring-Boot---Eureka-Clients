FROM openjdk:11
EXPOSE 8086

ADD target/feedback-0.0.1-SNAPSHOT.jar feedback-0.0.1.jar
ENTRYPOINT ["java", "-jar", "feedback-0.0.1.jar"]