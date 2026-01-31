package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service136.model.Model136;
import java.util.Optional;

public interface Entity136DatasourcePort {
    Optional<Model136> find(Long id);
}
