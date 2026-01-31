package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service951.model.Model951;
import java.util.Optional;

public interface Entity951DatasourcePort {
    Optional<Model951> find(Long id);
}
