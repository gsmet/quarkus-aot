package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service107.model.Model107;
import java.util.Optional;

public interface Entity107DatasourcePort {
    Optional<Model107> find(Long id);
}
