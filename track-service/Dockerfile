FROM openjdk:11-jdk-stretch

ADD /target/MuzixRestfulService-0.0.1-SNAPSHOT.jar /src/app/main/MuzixRestfulService-0.0.1-SNAPSHOT.jar

WORKDIR src/app/main

ENTRYPOINT ["java", "-jar", "MuzixRestfulService-0.0.1-SNAPSHOT.jar"]