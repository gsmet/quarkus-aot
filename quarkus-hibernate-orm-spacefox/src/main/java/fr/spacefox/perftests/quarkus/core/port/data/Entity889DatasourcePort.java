package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service889.model.Model889;
import java.util.Optional;

public interface Entity889DatasourcePort {
    Optional<Model889> find(Long id);
}
