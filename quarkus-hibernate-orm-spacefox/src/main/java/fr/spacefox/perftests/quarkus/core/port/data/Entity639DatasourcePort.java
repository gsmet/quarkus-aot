package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service639.model.Model639;
import java.util.Optional;

public interface Entity639DatasourcePort {
    Optional<Model639> find(Long id);
}
