package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service342.model.Model342;
import java.util.Optional;

public interface Entity342DatasourcePort {
    Optional<Model342> find(Long id);
}
