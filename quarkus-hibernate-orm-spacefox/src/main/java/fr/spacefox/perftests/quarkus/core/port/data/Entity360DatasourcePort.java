package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service360.model.Model360;
import java.util.Optional;

public interface Entity360DatasourcePort {
    Optional<Model360> find(Long id);
}
