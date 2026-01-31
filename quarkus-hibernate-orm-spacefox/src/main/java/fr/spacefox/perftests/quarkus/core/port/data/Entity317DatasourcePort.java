package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service317.model.Model317;
import java.util.Optional;

public interface Entity317DatasourcePort {
    Optional<Model317> find(Long id);
}
