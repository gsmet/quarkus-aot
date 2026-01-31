package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service912.model.Model912;
import java.util.Optional;

public interface Entity912DatasourcePort {
    Optional<Model912> find(Long id);
}
