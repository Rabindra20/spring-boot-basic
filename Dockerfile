FROM eclipse-temurin:17-jdk-focal AS build
# Set the working directory in the container
WORKDIR /app
# Copy the source code
COPY . .

# Build the application
RUN ./gradlew build --no-daemon

# Create a separate stage for the runtime environment
FROM eclipse-temurin:17-jdk-focal
# # Set the working directory in the container
WORKDIR /app

# Copy the compiled application from the build stage
COPY --from=build /app/build/libs/*.jar app.jar

EXPOSE 8080

# Command to run the Spring Boot application
CMD ["java", "-jar", "app.jar"]