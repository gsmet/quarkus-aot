package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service874.model.Model874;
import java.util.Optional;

public interface Entity874DatasourcePort {
    Optional<Model874> find(Long id);
}
