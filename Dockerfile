FROM openjdk:8
EXPOSE 8080
ADD target/cicd-github-actions.jar cicd-github-actions.jar
ENTRYPOINT ["Java", "-jar", "/cicd-github-actions.jar"]
