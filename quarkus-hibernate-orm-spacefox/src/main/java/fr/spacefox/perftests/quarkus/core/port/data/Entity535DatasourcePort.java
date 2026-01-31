package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service535.model.Model535;
import java.util.Optional;

public interface Entity535DatasourcePort {
    Optional<Model535> find(Long id);
}
