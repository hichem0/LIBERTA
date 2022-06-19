#build stage
FROM maven:3.5-jdk-8 AS build
WORKDIR /usr/src/app/
COPY . /usr/src/app/
RUN mvn clean package -DskipTests

#run stage
FROM openjdk:8-jdk-alpine
ENV APP_HOME=/opt/app/
WORKDIR $APP_HOME
COPY --from=build /usr/src/app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]
