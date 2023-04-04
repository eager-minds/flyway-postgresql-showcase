package tech.eagerminds.showcase.postgresflywayshowcase.service;

import java.util.List;
import org.flywaydb.core.Flyway;
import org.flywaydb.core.api.MigrationInfoService;
import org.flywaydb.core.api.MigrationVersion;
import org.flywaydb.core.api.configuration.FluentConfiguration;
import org.flywaydb.core.api.output.InfoResult;
import org.flywaydb.core.api.output.MigrateOutput;
import org.flywaydb.core.api.output.MigrateResult;
import org.flywaydb.core.api.output.UndoResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlywayServiceImpl implements FlywayService {

  private static final Logger LOG = LoggerFactory.getLogger(FlywayServiceImpl.class);


  private final Flyway flyway;
  private final FluentConfiguration fluentConfiguration;

  @Autowired
  public FlywayServiceImpl(Flyway flyway, FluentConfiguration fluentConfiguration) {
    this.flyway = flyway;
    this.fluentConfiguration = fluentConfiguration;
  }

  @Override
  public List<MigrateOutput> migrate(String targetVersion) {
    MigrationVersion migrationVersion = null;
    if (targetVersion != null) {
      migrationVersion = MigrationVersion.fromVersion(targetVersion);
    }
    MigrateResult migrateResult = fluentConfiguration.target(migrationVersion).load().migrate();
    LOG.info("Migrate result: {}", migrateResult);
    return migrateResult.migrations;
  }

  @Override
  public UndoResult undo(String targetVersion) {
    MigrationVersion migrationVersion = null;
    if (targetVersion != null) {
      migrationVersion = MigrationVersion.fromVersion(targetVersion);
    }
    UndoResult migrateResult = fluentConfiguration.target(migrationVersion).load().undo();
    LOG.info("Undo result: {}", migrateResult);
    return migrateResult;
  }

  @Override
  public InfoResult info() {
    MigrationInfoService migrationInfoService = flyway.info();
    return migrationInfoService.getInfoResult();
  }
}
