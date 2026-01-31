package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service64.model.Model64;
import java.util.Optional;

public interface Entity64DatasourcePort {
    Optional<Model64> find(Long id);
}
