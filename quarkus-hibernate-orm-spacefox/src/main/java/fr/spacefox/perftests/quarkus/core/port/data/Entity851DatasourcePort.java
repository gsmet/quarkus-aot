package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service851.model.Model851;
import java.util.Optional;

public interface Entity851DatasourcePort {
    Optional<Model851> find(Long id);
}
