package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service909.model.Model909;
import java.util.Optional;

public interface Entity909DatasourcePort {
    Optional<Model909> find(Long id);
}
