package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service855.model.Model855;
import java.util.Optional;

public interface Entity855DatasourcePort {
    Optional<Model855> find(Long id);
}
