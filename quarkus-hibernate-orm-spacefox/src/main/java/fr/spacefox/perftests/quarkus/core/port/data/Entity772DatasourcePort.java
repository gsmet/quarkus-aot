package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service772.model.Model772;
import java.util.Optional;

public interface Entity772DatasourcePort {
    Optional<Model772> find(Long id);
}
