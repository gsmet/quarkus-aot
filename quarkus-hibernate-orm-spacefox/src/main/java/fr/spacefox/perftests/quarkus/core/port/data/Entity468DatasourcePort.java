package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service468.model.Model468;
import java.util.Optional;

public interface Entity468DatasourcePort {
    Optional<Model468> find(Long id);
}
