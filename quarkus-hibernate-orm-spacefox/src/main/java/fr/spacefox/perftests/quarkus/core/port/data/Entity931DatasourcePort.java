package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service931.model.Model931;
import java.util.Optional;

public interface Entity931DatasourcePort {
    Optional<Model931> find(Long id);
}
