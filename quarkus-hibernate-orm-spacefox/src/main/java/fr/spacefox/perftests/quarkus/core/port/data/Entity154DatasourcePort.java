package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service154.model.Model154;
import java.util.Optional;

public interface Entity154DatasourcePort {
    Optional<Model154> find(Long id);
}
