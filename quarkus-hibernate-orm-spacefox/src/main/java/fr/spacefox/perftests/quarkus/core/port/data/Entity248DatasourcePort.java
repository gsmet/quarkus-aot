package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service248.model.Model248;
import java.util.Optional;

public interface Entity248DatasourcePort {
    Optional<Model248> find(Long id);
}
