package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service771.model.Model771;
import java.util.Optional;

public interface Entity771DatasourcePort {
    Optional<Model771> find(Long id);
}
