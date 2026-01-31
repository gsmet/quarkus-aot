package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service336.model.Model336;
import java.util.Optional;

public interface Entity336DatasourcePort {
    Optional<Model336> find(Long id);
}
