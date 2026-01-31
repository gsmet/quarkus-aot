package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service918.model.Model918;
import java.util.Optional;

public interface Entity918DatasourcePort {
    Optional<Model918> find(Long id);
}
