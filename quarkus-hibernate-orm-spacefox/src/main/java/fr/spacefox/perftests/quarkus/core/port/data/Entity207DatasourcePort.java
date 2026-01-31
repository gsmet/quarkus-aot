package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service207.model.Model207;
import java.util.Optional;

public interface Entity207DatasourcePort {
    Optional<Model207> find(Long id);
}
