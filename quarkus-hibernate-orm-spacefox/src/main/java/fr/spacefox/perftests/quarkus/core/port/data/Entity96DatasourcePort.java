package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service96.model.Model96;
import java.util.Optional;

public interface Entity96DatasourcePort {
    Optional<Model96> find(Long id);
}
