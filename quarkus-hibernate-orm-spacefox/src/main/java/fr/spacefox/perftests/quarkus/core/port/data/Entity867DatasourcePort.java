package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service867.model.Model867;
import java.util.Optional;

public interface Entity867DatasourcePort {
    Optional<Model867> find(Long id);
}
