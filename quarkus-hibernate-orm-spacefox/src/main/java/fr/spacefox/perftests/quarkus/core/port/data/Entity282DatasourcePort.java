package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service282.model.Model282;
import java.util.Optional;

public interface Entity282DatasourcePort {
    Optional<Model282> find(Long id);
}
