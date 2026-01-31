package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service504.model.Model504;
import java.util.Optional;

public interface Entity504DatasourcePort {
    Optional<Model504> find(Long id);
}
