package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service661.model.Model661;
import java.util.Optional;

public interface Entity661DatasourcePort {
    Optional<Model661> find(Long id);
}
