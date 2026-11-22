FROM maven:3.9-eclipse-temurin-25 as build
# Set working directory
WORKDIR /app

# Copy jar to container
COPY target/*.jar app.jar

# Expose port 8080
EXPOSE 8080

# Run the jar
ENTRYPOINT ["java", "-jar", "app.jar"]