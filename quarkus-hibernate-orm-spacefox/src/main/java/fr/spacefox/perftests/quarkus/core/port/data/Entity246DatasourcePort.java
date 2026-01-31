package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service246.model.Model246;
import java.util.Optional;

public interface Entity246DatasourcePort {
    Optional<Model246> find(Long id);
}
