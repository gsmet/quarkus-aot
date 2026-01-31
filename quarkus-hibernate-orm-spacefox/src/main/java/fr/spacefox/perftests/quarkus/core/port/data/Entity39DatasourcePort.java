package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service39.model.Model39;
import java.util.Optional;

public interface Entity39DatasourcePort {
    Optional<Model39> find(Long id);
}
