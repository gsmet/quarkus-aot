package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service776.model.Model776;
import java.util.Optional;

public interface Entity776DatasourcePort {
    Optional<Model776> find(Long id);
}
