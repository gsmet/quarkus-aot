package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service845.model.Model845;
import java.util.Optional;

public interface Entity845DatasourcePort {
    Optional<Model845> find(Long id);
}
