package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service712.model.Model712;
import java.util.Optional;

public interface Entity712DatasourcePort {
    Optional<Model712> find(Long id);
}
