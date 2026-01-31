package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service965.model.Model965;
import java.util.Optional;

public interface Entity965DatasourcePort {
    Optional<Model965> find(Long id);
}
