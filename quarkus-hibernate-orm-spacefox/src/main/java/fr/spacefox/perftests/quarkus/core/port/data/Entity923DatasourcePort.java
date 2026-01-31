package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service923.model.Model923;
import java.util.Optional;

public interface Entity923DatasourcePort {
    Optional<Model923> find(Long id);
}
