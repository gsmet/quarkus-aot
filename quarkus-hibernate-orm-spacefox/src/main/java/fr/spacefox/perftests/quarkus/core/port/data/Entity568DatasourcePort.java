package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service568.model.Model568;
import java.util.Optional;

public interface Entity568DatasourcePort {
    Optional<Model568> find(Long id);
}
