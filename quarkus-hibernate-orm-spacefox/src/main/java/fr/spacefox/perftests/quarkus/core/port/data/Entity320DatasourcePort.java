package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service320.model.Model320;
import java.util.Optional;

public interface Entity320DatasourcePort {
    Optional<Model320> find(Long id);
}
