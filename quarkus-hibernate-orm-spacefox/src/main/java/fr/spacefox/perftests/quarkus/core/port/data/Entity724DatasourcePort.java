package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service724.model.Model724;
import java.util.Optional;

public interface Entity724DatasourcePort {
    Optional<Model724> find(Long id);
}
