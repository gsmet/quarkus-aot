package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service793.model.Model793;
import java.util.Optional;

public interface Entity793DatasourcePort {
    Optional<Model793> find(Long id);
}
