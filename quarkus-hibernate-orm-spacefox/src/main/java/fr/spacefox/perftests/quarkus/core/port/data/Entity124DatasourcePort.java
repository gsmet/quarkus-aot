package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service124.model.Model124;
import java.util.Optional;

public interface Entity124DatasourcePort {
    Optional<Model124> find(Long id);
}
