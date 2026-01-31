package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service394.model.Model394;
import java.util.Optional;

public interface Entity394DatasourcePort {
    Optional<Model394> find(Long id);
}
