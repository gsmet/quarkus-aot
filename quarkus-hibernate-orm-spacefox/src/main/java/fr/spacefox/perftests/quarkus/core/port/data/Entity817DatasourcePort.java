package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service817.model.Model817;
import java.util.Optional;

public interface Entity817DatasourcePort {
    Optional<Model817> find(Long id);
}
