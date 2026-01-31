package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service160.model.Model160;
import java.util.Optional;

public interface Entity160DatasourcePort {
    Optional<Model160> find(Long id);
}
