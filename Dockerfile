# Use the official OpenJDK image as a base image
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the project jar file to the container
COPY target/job-portal-0.0.1-SNAPSHOT.jar /app/Job-Portal-Application.jar

# Expose the port the application runs on
EXPOSE 8080

# Command to run the application
ENTRYPOINT ["java", "-jar", "Job-Portal-Application.jar"]
