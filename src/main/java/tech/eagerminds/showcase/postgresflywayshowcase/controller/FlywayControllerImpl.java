package tech.eagerminds.showcase.postgresflywayshowcase.controller;

import java.util.List;
import org.flywaydb.core.api.output.InfoResult;
import org.flywaydb.core.api.output.MigrateOutput;
import org.flywaydb.core.api.output.UndoResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.eagerminds.showcase.postgresflywayshowcase.service.FlywayService;

@RestController
@RequestMapping("/flyway")
public class FlywayControllerImpl implements FlywayController {

  private final FlywayService flywayService;

  @Autowired
  public FlywayControllerImpl(FlywayService flywayService) {
    this.flywayService = flywayService;
  }

  @Override
  public List<MigrateOutput> migrate(String targetVersion) {
    return flywayService.migrate(targetVersion);
  }

  @Override
  public UndoResult undo(String targetVersion) {
    return flywayService.undo(targetVersion);
  }

  @Override
  public InfoResult info() {
    InfoResult infoAll = flywayService.info();
    return infoAll;
  }

}
