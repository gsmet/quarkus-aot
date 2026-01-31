package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service391.model.Model391;
import java.util.Optional;

public interface Entity391DatasourcePort {
    Optional<Model391> find(Long id);
}
