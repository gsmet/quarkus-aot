package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service723.model.Model723;
import java.util.Optional;

public interface Entity723DatasourcePort {
    Optional<Model723> find(Long id);
}
