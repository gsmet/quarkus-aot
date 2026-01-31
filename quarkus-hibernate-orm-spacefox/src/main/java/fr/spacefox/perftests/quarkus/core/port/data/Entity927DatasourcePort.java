package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service927.model.Model927;
import java.util.Optional;

public interface Entity927DatasourcePort {
    Optional<Model927> find(Long id);
}
