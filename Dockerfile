FROM maven:3-amazoncorretto-17 as builder
MAINTAINER eagerminds
WORKDIR '/app'
ARG FLYWAY_LICENSE_KEY
COPY pom.xml .
RUN /usr/local/bin/mvn-entrypoint.sh mvn dependency:go-offline
RUN /usr/local/bin/mvn-entrypoint.sh mvn verify clean --fail-never
COPY . .
RUN /usr/local/bin/mvn-entrypoint.sh mvn clean package -P docker,postgresql -DfinalName=app

FROM amazoncorretto:17
COPY --from=builder /app/target/app.jar .
CMD java -jar app.jar --spring.flyway.license-key=$FLYWAY_LICENSE_KEY