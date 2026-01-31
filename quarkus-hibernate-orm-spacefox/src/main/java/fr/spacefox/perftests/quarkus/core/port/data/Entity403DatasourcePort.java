package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service403.model.Model403;
import java.util.Optional;

public interface Entity403DatasourcePort {
    Optional<Model403> find(Long id);
}
