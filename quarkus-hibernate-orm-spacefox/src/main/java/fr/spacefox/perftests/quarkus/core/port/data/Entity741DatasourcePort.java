package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service741.model.Model741;
import java.util.Optional;

public interface Entity741DatasourcePort {
    Optional<Model741> find(Long id);
}
