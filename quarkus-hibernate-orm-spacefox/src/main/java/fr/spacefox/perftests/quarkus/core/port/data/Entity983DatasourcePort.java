package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service983.model.Model983;
import java.util.Optional;

public interface Entity983DatasourcePort {
    Optional<Model983> find(Long id);
}
