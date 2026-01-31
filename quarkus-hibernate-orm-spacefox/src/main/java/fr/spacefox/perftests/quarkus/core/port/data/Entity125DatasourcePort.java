package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service125.model.Model125;
import java.util.Optional;

public interface Entity125DatasourcePort {
    Optional<Model125> find(Long id);
}
