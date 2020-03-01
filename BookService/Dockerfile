FROM openjdk:11
COPY ./target/BookService-0.0.1-SNAPSHOT.jar /usr/src/bookservice/
WORKDIR /usr/src/bookservice/
EXPOSE 8081:8081
ENTRYPOINT ["java", "-jar", "BookService-0.0.1-SNAPSHOT.jar"]
