package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service27.model.Model27;
import java.util.Optional;

public interface Entity27DatasourcePort {
    Optional<Model27> find(Long id);
}
