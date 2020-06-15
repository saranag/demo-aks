FROM openjdk:8
ADD target/demoaks.war demoaks.war
EXPOSE 8085
ENTRYPOINT ["java","-jar","demoaks.war"]
