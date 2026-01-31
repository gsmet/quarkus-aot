package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service916.model.Model916;
import java.util.Optional;

public interface Entity916DatasourcePort {
    Optional<Model916> find(Long id);
}
