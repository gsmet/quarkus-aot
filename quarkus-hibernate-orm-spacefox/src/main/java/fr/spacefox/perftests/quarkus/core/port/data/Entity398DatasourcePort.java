package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service398.model.Model398;
import java.util.Optional;

public interface Entity398DatasourcePort {
    Optional<Model398> find(Long id);
}
