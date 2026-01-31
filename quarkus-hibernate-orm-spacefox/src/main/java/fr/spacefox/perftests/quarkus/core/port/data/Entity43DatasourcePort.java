package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service43.model.Model43;
import java.util.Optional;

public interface Entity43DatasourcePort {
    Optional<Model43> find(Long id);
}
