package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service890.model.Model890;
import java.util.Optional;

public interface Entity890DatasourcePort {
    Optional<Model890> find(Long id);
}
