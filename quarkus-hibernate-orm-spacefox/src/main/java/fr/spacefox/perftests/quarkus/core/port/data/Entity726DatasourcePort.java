package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service726.model.Model726;
import java.util.Optional;

public interface Entity726DatasourcePort {
    Optional<Model726> find(Long id);
}
