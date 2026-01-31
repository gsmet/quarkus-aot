package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service614.model.Model614;
import java.util.Optional;

public interface Entity614DatasourcePort {
    Optional<Model614> find(Long id);
}
