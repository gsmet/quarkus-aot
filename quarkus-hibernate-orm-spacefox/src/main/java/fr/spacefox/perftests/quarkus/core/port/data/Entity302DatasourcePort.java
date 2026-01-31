package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service302.model.Model302;
import java.util.Optional;

public interface Entity302DatasourcePort {
    Optional<Model302> find(Long id);
}
