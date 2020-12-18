FROM maven:3-openjdk-8-slim

COPY ./ ./

EXPOSE 8080:8080

CMD ["mvn", "spring-boot:run"]