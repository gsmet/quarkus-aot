package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service904.model.Model904;
import java.util.Optional;

public interface Entity904DatasourcePort {
    Optional<Model904> find(Long id);
}
