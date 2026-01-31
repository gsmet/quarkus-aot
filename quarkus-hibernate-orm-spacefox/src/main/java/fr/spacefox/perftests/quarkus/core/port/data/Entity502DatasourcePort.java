package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service502.model.Model502;
import java.util.Optional;

public interface Entity502DatasourcePort {
    Optional<Model502> find(Long id);
}
