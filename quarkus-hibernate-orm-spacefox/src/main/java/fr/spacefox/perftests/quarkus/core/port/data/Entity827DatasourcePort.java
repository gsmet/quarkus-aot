package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service827.model.Model827;
import java.util.Optional;

public interface Entity827DatasourcePort {
    Optional<Model827> find(Long id);
}
