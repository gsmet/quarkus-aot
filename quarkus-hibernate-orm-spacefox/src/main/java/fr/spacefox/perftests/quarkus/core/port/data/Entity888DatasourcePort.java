package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service888.model.Model888;
import java.util.Optional;

public interface Entity888DatasourcePort {
    Optional<Model888> find(Long id);
}
