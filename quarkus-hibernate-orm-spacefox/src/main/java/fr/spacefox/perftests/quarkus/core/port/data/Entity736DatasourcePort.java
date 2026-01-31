package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service736.model.Model736;
import java.util.Optional;

public interface Entity736DatasourcePort {
    Optional<Model736> find(Long id);
}
