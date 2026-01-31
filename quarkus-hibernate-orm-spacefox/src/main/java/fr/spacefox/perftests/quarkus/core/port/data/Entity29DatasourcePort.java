package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service29.model.Model29;
import java.util.Optional;

public interface Entity29DatasourcePort {
    Optional<Model29> find(Long id);
}
