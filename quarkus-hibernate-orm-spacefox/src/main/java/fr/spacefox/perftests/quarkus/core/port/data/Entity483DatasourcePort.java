package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service483.model.Model483;
import java.util.Optional;

public interface Entity483DatasourcePort {
    Optional<Model483> find(Long id);
}
