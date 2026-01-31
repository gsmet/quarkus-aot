package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service93.model.Model93;
import java.util.Optional;

public interface Entity93DatasourcePort {
    Optional<Model93> find(Long id);
}
