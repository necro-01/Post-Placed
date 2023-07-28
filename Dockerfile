FROM openjdk:17
LABEL authors="prits"
EXPOSE 5000
COPY target/blog-api-docker.jar blog-api-docker.jar
ENTRYPOINT ["java", "-jar", "/blog-api-docker.jar"]
