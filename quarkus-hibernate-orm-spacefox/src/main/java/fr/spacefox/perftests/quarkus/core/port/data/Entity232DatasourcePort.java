package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service232.model.Model232;
import java.util.Optional;

public interface Entity232DatasourcePort {
    Optional<Model232> find(Long id);
}
