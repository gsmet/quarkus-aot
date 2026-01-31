package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service422.model.Model422;
import java.util.Optional;

public interface Entity422DatasourcePort {
    Optional<Model422> find(Long id);
}
