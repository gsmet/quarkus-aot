package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service387.model.Model387;
import java.util.Optional;

public interface Entity387DatasourcePort {
    Optional<Model387> find(Long id);
}
