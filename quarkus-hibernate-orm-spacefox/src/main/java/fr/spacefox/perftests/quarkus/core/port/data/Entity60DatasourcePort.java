package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service60.model.Model60;
import java.util.Optional;

public interface Entity60DatasourcePort {
    Optional<Model60> find(Long id);
}
