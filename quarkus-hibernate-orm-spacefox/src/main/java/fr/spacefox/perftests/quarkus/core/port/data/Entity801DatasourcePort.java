package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service801.model.Model801;
import java.util.Optional;

public interface Entity801DatasourcePort {
    Optional<Model801> find(Long id);
}
