package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service677.model.Model677;
import java.util.Optional;

public interface Entity677DatasourcePort {
    Optional<Model677> find(Long id);
}
