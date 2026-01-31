package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service668.model.Model668;
import java.util.Optional;

public interface Entity668DatasourcePort {
    Optional<Model668> find(Long id);
}
