FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
ADD /target/Boilerplate_spring-0.0.1-SNAPSHOT.jar Boilerplate_spring.jar
RUN mkdir "images"
ENTRYPOINT ["java","-jar","/Boilerplate_spring.jar","--spring.profiles.active=${PROFILE}"]