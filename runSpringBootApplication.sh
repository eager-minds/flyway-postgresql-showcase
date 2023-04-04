#!/bin/sh

serverPort="${1:-8081}"
mvn spring-boot:run \
  -Dspring-boot.run.arguments="--server.port=$serverPort --spring.flyway.license-key=$FLYWAY_LICENSE_KEY"
