package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service625.model.Model625;
import java.util.Optional;

public interface Entity625DatasourcePort {
    Optional<Model625> find(Long id);
}
