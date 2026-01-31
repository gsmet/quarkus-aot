package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service998.model.Model998;
import java.util.Optional;

public interface Entity998DatasourcePort {
    Optional<Model998> find(Long id);
}
