package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service338.model.Model338;
import java.util.Optional;

public interface Entity338DatasourcePort {
    Optional<Model338> find(Long id);
}
