package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service309.model.Model309;
import java.util.Optional;

public interface Entity309DatasourcePort {
    Optional<Model309> find(Long id);
}
