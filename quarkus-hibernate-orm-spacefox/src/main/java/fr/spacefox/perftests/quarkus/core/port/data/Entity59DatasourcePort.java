package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service59.model.Model59;
import java.util.Optional;

public interface Entity59DatasourcePort {
    Optional<Model59> find(Long id);
}
