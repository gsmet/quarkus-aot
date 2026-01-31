package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service351.model.Model351;
import java.util.Optional;

public interface Entity351DatasourcePort {
    Optional<Model351> find(Long id);
}
