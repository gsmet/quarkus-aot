package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service62.model.Model62;
import java.util.Optional;

public interface Entity62DatasourcePort {
    Optional<Model62> find(Long id);
}
