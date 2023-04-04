package tech.eagerminds.showcase.postgresflywayshowcase.service;

import java.util.List;
import org.flywaydb.core.api.output.InfoResult;
import org.flywaydb.core.api.output.MigrateOutput;
import org.flywaydb.core.api.output.UndoResult;

public interface FlywayService {

  List<MigrateOutput> migrate(String targetVersion);

  UndoResult undo(String targetVersion);

  InfoResult info();
}
