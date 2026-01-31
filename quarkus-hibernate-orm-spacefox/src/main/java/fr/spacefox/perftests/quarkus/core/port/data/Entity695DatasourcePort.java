package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service695.model.Model695;
import java.util.Optional;

public interface Entity695DatasourcePort {
    Optional<Model695> find(Long id);
}
