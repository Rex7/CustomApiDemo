# Start with a base image containing Java runtime
FROM maven:3.8.4-openjdk-11 AS build

# Add Maintainer Info
LABEL maintainer="regischarles7@gmail.com"

WORKDIR /app

# Copy the pom.xml and install dependencies
COPY pom.xml .
COPY src ./src

# Add a volume pointing to /tmp
VOLUME /tmp

# Package the application
RUN mvn clean package

# Make port 8080 available to the world outside this container
EXPOSE 8080

# The application's jar file

COPY --from=build /app/target/*.jar app.jar

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
