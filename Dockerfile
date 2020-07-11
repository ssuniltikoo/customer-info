FROM openjdk:8-jdk-alpine
COPY target/customer-info-1.0-SNAPSHOT.jar /app/
RUN chown nobody /app/customer-info-1.0-SNAPSHOT.jar && chmod +x /app/customer-info-1.0-SNAPSHOT.jar
USER 99
EXPOSE 8085
CMD java $JAVA_OPTS -jar /app/customer-info-1.0-SNAPSHOT.jar