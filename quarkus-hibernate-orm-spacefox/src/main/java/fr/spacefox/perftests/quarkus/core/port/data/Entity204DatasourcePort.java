package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service204.model.Model204;
import java.util.Optional;

public interface Entity204DatasourcePort {
    Optional<Model204> find(Long id);
}
