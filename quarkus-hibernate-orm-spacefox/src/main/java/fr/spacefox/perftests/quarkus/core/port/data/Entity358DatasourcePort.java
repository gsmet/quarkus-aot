package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service358.model.Model358;
import java.util.Optional;

public interface Entity358DatasourcePort {
    Optional<Model358> find(Long id);
}
