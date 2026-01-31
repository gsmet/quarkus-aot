package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service175.model.Model175;
import java.util.Optional;

public interface Entity175DatasourcePort {
    Optional<Model175> find(Long id);
}
