FROM openjdk:11-jdk-stretch

ADD /target/SpringBoot_Restful_Service-0.0.1-SNAPSHOT.jar /src/app/main/SpringBoot_Restful_Service-0.0.1-SNAPSHOT.jar

WORKDIR src/app/main

ENTRYPOINT ["java", "-jar", "SpringBoot_Restful_Service-0.0.1-SNAPSHOT.jar"]