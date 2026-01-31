package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service287.model.Model287;
import java.util.Optional;

public interface Entity287DatasourcePort {
    Optional<Model287> find(Long id);
}
