package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service122.model.Model122;
import java.util.Optional;

public interface Entity122DatasourcePort {
    Optional<Model122> find(Long id);
}
