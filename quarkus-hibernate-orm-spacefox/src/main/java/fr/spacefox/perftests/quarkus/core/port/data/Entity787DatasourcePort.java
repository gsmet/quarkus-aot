package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service787.model.Model787;
import java.util.Optional;

public interface Entity787DatasourcePort {
    Optional<Model787> find(Long id);
}
