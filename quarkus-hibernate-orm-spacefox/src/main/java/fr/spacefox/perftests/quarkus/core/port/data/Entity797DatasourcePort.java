package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service797.model.Model797;
import java.util.Optional;

public interface Entity797DatasourcePort {
    Optional<Model797> find(Long id);
}
