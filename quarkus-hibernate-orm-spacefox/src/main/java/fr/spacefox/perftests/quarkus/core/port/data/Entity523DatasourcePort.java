package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service523.model.Model523;
import java.util.Optional;

public interface Entity523DatasourcePort {
    Optional<Model523> find(Long id);
}
