package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service49.model.Model49;
import java.util.Optional;

public interface Entity49DatasourcePort {
    Optional<Model49> find(Long id);
}
