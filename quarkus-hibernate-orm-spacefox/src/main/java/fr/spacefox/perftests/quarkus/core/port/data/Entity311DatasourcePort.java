package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service311.model.Model311;
import java.util.Optional;

public interface Entity311DatasourcePort {
    Optional<Model311> find(Long id);
}
