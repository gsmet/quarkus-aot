package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service137.model.Model137;
import java.util.Optional;

public interface Entity137DatasourcePort {
    Optional<Model137> find(Long id);
}
