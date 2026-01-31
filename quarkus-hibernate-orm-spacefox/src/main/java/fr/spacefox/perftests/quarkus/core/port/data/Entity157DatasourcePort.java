package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service157.model.Model157;
import java.util.Optional;

public interface Entity157DatasourcePort {
    Optional<Model157> find(Long id);
}
