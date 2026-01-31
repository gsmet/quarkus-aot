package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service812.model.Model812;
import java.util.Optional;

public interface Entity812DatasourcePort {
    Optional<Model812> find(Long id);
}
