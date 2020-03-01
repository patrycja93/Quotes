FROM openjdk:11
COPY ./target/QuoteDiscoveryServer-0.0.1-SNAPSHOT.jar /usr/src/quotediscoveryserver/
WORKDIR /usr/src/quotediscoveryserver/
EXPOSE 8761:8761
ENTRYPOINT ["java", "-jar", "QuoteDiscoveryServer-0.0.1-SNAPSHOT.jar"]
