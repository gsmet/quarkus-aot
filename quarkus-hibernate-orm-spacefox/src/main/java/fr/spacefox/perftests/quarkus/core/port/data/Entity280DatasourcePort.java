package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service280.model.Model280;
import java.util.Optional;

public interface Entity280DatasourcePort {
    Optional<Model280> find(Long id);
}
