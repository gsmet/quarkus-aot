package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service118.model.Model118;
import java.util.Optional;

public interface Entity118DatasourcePort {
    Optional<Model118> find(Long id);
}
