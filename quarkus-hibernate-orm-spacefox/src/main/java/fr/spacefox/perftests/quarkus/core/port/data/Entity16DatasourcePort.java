package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service16.model.Model16;
import java.util.Optional;

public interface Entity16DatasourcePort {
    Optional<Model16> find(Long id);
}
