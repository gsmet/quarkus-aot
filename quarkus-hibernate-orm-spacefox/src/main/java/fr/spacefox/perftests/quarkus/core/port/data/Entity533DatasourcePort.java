package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service533.model.Model533;
import java.util.Optional;

public interface Entity533DatasourcePort {
    Optional<Model533> find(Long id);
}
