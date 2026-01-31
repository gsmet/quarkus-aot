package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service79.model.Model79;
import java.util.Optional;

public interface Entity79DatasourcePort {
    Optional<Model79> find(Long id);
}
