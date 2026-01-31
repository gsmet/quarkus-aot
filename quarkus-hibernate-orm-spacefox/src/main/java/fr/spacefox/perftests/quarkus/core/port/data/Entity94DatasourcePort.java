package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service94.model.Model94;
import java.util.Optional;

public interface Entity94DatasourcePort {
    Optional<Model94> find(Long id);
}
