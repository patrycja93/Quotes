FROM openjdk:11
COPY ./target/QuoteConfigServer-0.0.1-SNAPSHOT.jar /usr/src/quoteconfigserver/
WORKDIR /usr/src/quoteconfigserver/
EXPOSE 8888:8888
ENTRYPOINT ["java", "-jar", "QuoteConfigServer-0.0.1-SNAPSHOT.jar"]
