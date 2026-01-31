package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service674.model.Model674;
import java.util.Optional;

public interface Entity674DatasourcePort {
    Optional<Model674> find(Long id);
}
