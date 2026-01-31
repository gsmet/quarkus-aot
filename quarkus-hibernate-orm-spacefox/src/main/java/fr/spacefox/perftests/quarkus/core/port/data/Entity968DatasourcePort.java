package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service968.model.Model968;
import java.util.Optional;

public interface Entity968DatasourcePort {
    Optional<Model968> find(Long id);
}
