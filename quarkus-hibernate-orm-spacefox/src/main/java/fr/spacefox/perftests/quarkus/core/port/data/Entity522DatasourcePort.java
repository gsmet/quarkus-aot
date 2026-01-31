package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service522.model.Model522;
import java.util.Optional;

public interface Entity522DatasourcePort {
    Optional<Model522> find(Long id);
}
