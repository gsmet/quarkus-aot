package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service430.model.Model430;
import java.util.Optional;

public interface Entity430DatasourcePort {
    Optional<Model430> find(Long id);
}
