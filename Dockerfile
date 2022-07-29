FROM openjdk:8
EXPOSE 8999
ADD target/cicd-integration.jar cicd-integration.jar
ENTRYPOINT ["java","-jar","/cicd-integration.jar"]