package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service295.model.Model295;
import java.util.Optional;

public interface Entity295DatasourcePort {
    Optional<Model295> find(Long id);
}
