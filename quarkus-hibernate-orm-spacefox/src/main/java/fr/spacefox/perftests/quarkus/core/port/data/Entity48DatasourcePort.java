package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service48.model.Model48;
import java.util.Optional;

public interface Entity48DatasourcePort {
    Optional<Model48> find(Long id);
}
