package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service729.model.Model729;
import java.util.Optional;

public interface Entity729DatasourcePort {
    Optional<Model729> find(Long id);
}
