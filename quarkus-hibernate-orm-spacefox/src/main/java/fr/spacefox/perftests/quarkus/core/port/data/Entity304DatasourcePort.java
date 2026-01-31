package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service304.model.Model304;
import java.util.Optional;

public interface Entity304DatasourcePort {
    Optional<Model304> find(Long id);
}
