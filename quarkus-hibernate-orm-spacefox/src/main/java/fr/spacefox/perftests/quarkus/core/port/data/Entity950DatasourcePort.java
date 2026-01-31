package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service950.model.Model950;
import java.util.Optional;

public interface Entity950DatasourcePort {
    Optional<Model950> find(Long id);
}
