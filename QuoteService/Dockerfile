FROM openjdk:11
COPY ./target/QuoteService-0.0.1-SNAPSHOT.jar /usr/src/quoteservice/
WORKDIR /usr/src/quoteservice/
EXPOSE 8080:8080
ENTRYPOINT ["java", "-jar", "QuoteService-0.0.1-SNAPSHOT.jar"]
