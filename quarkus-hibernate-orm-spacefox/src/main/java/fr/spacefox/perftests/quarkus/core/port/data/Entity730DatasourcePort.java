package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service730.model.Model730;
import java.util.Optional;

public interface Entity730DatasourcePort {
    Optional<Model730> find(Long id);
}
