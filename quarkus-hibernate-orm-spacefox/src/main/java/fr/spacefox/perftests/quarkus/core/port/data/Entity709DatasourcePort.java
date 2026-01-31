package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service709.model.Model709;
import java.util.Optional;

public interface Entity709DatasourcePort {
    Optional<Model709> find(Long id);
}
