package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service991.model.Model991;
import java.util.Optional;

public interface Entity991DatasourcePort {
    Optional<Model991> find(Long id);
}
