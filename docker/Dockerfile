FROM maven:3.5.3-jdk-8-alpine
WORKDIR /usr/src/java-code
COPY ./app /usr/src/java-code/
RUN mvn clean package
 
WORKDIR /usr/src/java-app
RUN cp /usr/src/java-code/target/*.jar ./app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]
