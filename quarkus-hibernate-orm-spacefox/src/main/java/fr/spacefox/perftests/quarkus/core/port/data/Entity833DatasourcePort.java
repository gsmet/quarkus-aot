package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service833.model.Model833;
import java.util.Optional;

public interface Entity833DatasourcePort {
    Optional<Model833> find(Long id);
}
