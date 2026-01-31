package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service539.model.Model539;
import java.util.Optional;

public interface Entity539DatasourcePort {
    Optional<Model539> find(Long id);
}
