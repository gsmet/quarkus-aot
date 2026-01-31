package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service402.model.Model402;
import java.util.Optional;

public interface Entity402DatasourcePort {
    Optional<Model402> find(Long id);
}
