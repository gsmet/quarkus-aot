package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service166.model.Model166;
import java.util.Optional;

public interface Entity166DatasourcePort {
    Optional<Model166> find(Long id);
}
