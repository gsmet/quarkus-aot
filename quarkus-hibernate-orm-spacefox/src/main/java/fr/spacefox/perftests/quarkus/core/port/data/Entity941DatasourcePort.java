package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service941.model.Model941;
import java.util.Optional;

public interface Entity941DatasourcePort {
    Optional<Model941> find(Long id);
}
