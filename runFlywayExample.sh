#!/bin/sh

licenseKey="$FLYWAY_LICENSE_KEY"

mvn flyway:migrate -Dflyway.licenseKey=$licenseKey
mvn flyway:undo -Dflyway.licenseKey=$licenseKey -Dflyway.target=3
mvn flyway:migrate -Dflyway.licenseKey=$licenseKey
mvn flyway:undo -Dflyway.licenseKey=$licenseKey -Dflyway.target=1
mvn flyway:migrate -Dflyway.licenseKey=$licenseKey
mvn flyway:undo -Dflyway.licenseKey=$licenseKey -Dflyway.target=2
mvn flyway:info -Dflyway.licenseKey=$licenseKey
