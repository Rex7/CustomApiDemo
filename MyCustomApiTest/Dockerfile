# Use a Maven image to build the application
FROM maven:3.8.4-openjdk-17 AS build

# Set the working directory
WORKDIR /app

# Copy the pom.xml and install dependencies
COPY pom.xml .
COPY src ./src

# Package the application
RUN mvn clean package

# Use a lightweight image to run the application
FROM openjdk:17-slim

EXPOSE 8080

# Set the working directory
WORKDIR /app

# Copy the built JAR file from the previous stage
COPY --from=build /app/target/*.jar app.jar

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
