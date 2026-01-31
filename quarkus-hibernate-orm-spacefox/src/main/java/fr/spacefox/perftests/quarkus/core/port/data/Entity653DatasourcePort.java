package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service653.model.Model653;
import java.util.Optional;

public interface Entity653DatasourcePort {
    Optional<Model653> find(Long id);
}
