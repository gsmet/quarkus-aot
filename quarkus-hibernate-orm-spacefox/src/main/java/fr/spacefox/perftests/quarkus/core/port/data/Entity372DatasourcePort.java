package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service372.model.Model372;
import java.util.Optional;

public interface Entity372DatasourcePort {
    Optional<Model372> find(Long id);
}
