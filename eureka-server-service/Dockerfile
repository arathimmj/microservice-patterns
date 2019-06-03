FROM openjdk:11-jdk-stretch

ADD target/eureka-server-service-0.0.1-SNAPSHOT.jar /src/app/main/eureka-server-service-0.0.1-SNAPSHOT.jar

WORKDIR src/app/main

ENTRYPOINT ["java", "-jar", "eureka-server-service-0.0.1-SNAPSHOT.jar"]