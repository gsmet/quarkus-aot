package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service503.model.Model503;
import java.util.Optional;

public interface Entity503DatasourcePort {
    Optional<Model503> find(Long id);
}
