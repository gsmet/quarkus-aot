package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service313.model.Model313;
import java.util.Optional;

public interface Entity313DatasourcePort {
    Optional<Model313> find(Long id);
}
