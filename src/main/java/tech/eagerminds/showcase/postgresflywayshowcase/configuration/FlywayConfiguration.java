package tech.eagerminds.showcase.postgresflywayshowcase.configuration;

import javax.sql.DataSource;
import org.flywaydb.core.Flyway;
import org.flywaydb.core.api.configuration.FluentConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tech.eagerminds.showcase.postgresflywayshowcase.component.FlywayProperties;

@Configuration
public class FlywayConfiguration {

  @Bean
  public FluentConfiguration fluentConfiguration(DataSource dataSource, FlywayProperties flywayProperties) {
    return Flyway.configure()
        .dataSource(dataSource)
        .licenseKey(flywayProperties.licenseKey())
        .ignoreMigrationPatterns(flywayProperties.ignoreMigrationPatterns())
        .locations(flywayProperties.locations())
        .schemas(flywayProperties.schemas());
  }

  @Bean
  public Flyway flyway(FluentConfiguration fluentConfiguration) {
    return fluentConfiguration.load();
  }

}
