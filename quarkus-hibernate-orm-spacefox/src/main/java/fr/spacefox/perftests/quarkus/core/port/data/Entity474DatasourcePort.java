package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service474.model.Model474;
import java.util.Optional;

public interface Entity474DatasourcePort {
    Optional<Model474> find(Long id);
}
