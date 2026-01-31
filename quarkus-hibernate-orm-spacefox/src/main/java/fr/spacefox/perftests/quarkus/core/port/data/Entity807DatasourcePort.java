package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service807.model.Model807;
import java.util.Optional;

public interface Entity807DatasourcePort {
    Optional<Model807> find(Long id);
}
