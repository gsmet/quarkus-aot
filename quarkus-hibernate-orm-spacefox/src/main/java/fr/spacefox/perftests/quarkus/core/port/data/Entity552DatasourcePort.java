package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service552.model.Model552;
import java.util.Optional;

public interface Entity552DatasourcePort {
    Optional<Model552> find(Long id);
}
