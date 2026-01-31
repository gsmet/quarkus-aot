package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service958.model.Model958;
import java.util.Optional;

public interface Entity958DatasourcePort {
    Optional<Model958> find(Long id);
}
