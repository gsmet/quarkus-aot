package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service691.model.Model691;
import java.util.Optional;

public interface Entity691DatasourcePort {
    Optional<Model691> find(Long id);
}
