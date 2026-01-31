package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service380.model.Model380;
import java.util.Optional;

public interface Entity380DatasourcePort {
    Optional<Model380> find(Long id);
}
