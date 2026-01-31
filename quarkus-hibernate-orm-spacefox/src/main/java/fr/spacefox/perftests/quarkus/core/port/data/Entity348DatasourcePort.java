package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service348.model.Model348;
import java.util.Optional;

public interface Entity348DatasourcePort {
    Optional<Model348> find(Long id);
}
