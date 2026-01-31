package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service894.model.Model894;
import java.util.Optional;

public interface Entity894DatasourcePort {
    Optional<Model894> find(Long id);
}
