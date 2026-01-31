package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service231.model.Model231;
import java.util.Optional;

public interface Entity231DatasourcePort {
    Optional<Model231> find(Long id);
}
