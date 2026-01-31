package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service37.model.Model37;
import java.util.Optional;

public interface Entity37DatasourcePort {
    Optional<Model37> find(Long id);
}
