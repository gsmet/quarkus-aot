package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service353.model.Model353;
import java.util.Optional;

public interface Entity353DatasourcePort {
    Optional<Model353> find(Long id);
}
