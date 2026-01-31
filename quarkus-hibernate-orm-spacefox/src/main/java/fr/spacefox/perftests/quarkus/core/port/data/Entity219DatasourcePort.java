package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service219.model.Model219;
import java.util.Optional;

public interface Entity219DatasourcePort {
    Optional<Model219> find(Long id);
}
