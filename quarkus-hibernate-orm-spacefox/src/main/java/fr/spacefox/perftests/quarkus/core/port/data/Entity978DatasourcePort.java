package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service978.model.Model978;
import java.util.Optional;

public interface Entity978DatasourcePort {
    Optional<Model978> find(Long id);
}
