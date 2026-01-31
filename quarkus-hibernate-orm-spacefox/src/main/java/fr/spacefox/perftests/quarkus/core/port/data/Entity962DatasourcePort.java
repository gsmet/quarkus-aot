package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service962.model.Model962;
import java.util.Optional;

public interface Entity962DatasourcePort {
    Optional<Model962> find(Long id);
}
