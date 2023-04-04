package tech.eagerminds.showcase.postgresflywayshowcase.component;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "spring.flyway")
public class FlywayProperties {

  private String licenseKey;
  private String[] locations;
  private String[] schemas;
  private String baselineVersion;
  private String[] ignoreMigrationPatterns;

  public String licenseKey() {
    return licenseKey;
  }

  public void setLicenseKey(String licenseKey) {
    this.licenseKey = licenseKey;
  }

  public String[] locations() {
    return locations;
  }

  public void setLocations(String[] locations) {
    this.locations = locations;
  }

  public String[] schemas() {
    return schemas;
  }

  public void setSchemas(String[] schemas) {
    this.schemas = schemas;
  }

  public String baselineVersion() {
    return baselineVersion;
  }

  public void setBaselineVersion(String baselineVersion) {
    this.baselineVersion = baselineVersion;
  }

  public String[] ignoreMigrationPatterns() {
    return ignoreMigrationPatterns;
  }

  public void setIgnoreMigrationPatterns(String[] ignoreMigrationPatterns) {
    this.ignoreMigrationPatterns = ignoreMigrationPatterns;
  }
}
