FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
ADD /target/odm_back-0.0.1-SNAPSHOT.jar odm_back.jar
RUN mkdir "images"
ENTRYPOINT ["java","-jar","/odm_back.jar","--spring.profiles.active=${PROFILE}"]