package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service63.model.Model63;
import java.util.Optional;

public interface Entity63DatasourcePort {
    Optional<Model63> find(Long id);
}
