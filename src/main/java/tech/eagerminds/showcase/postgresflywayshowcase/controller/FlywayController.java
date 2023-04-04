package tech.eagerminds.showcase.postgresflywayshowcase.controller;

import java.util.List;
import org.flywaydb.core.api.output.InfoResult;
import org.flywaydb.core.api.output.MigrateOutput;
import org.flywaydb.core.api.output.UndoResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public interface FlywayController {

  @GetMapping("migrate")
  List<MigrateOutput> migrate(@RequestParam(required = false) String targetVersion);

  @GetMapping("undo")
  UndoResult undo(@RequestParam(required = false) String targetVersion);

  @GetMapping("info")
  InfoResult info();
}
