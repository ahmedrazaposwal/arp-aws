# step 1: use java base image
FROM eclipse-temurin:21-jdk

# step 2: Set working directory inside container
WORKDIR /app

# step 3: copy jar into container
COPY target/arp-aws-0.0.1-SNAPSHOT.jar app.jar

# step 4: Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]