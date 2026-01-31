package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service553.model.Model553;
import java.util.Optional;

public interface Entity553DatasourcePort {
    Optional<Model553> find(Long id);
}
