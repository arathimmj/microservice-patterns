FROM openjdk:11-jdk-stretch

ADD target/gatewayproxyservice-0.0.1-SNAPSHOT.jar /src/app/main/gatewayproxyservice-0.0.1-SNAPSHOT.jar

WORKDIR src/app/main

ENTRYPOINT ["java", "-jar", "gatewayproxyservice-0.0.1-SNAPSHOT.jar"]