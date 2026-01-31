package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service896.model.Model896;
import java.util.Optional;

public interface Entity896DatasourcePort {
    Optional<Model896> find(Long id);
}
