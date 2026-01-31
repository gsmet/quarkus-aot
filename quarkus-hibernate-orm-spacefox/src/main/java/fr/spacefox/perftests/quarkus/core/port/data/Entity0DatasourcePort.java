package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service0.model.Model0;
import java.util.Optional;

public interface Entity0DatasourcePort {
    Optional<Model0> find(Long id);
}
