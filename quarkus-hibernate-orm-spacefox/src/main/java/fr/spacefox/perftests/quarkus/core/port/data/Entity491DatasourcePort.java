package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service491.model.Model491;
import java.util.Optional;

public interface Entity491DatasourcePort {
    Optional<Model491> find(Long id);
}
