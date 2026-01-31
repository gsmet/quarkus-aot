package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service509.model.Model509;
import java.util.Optional;

public interface Entity509DatasourcePort {
    Optional<Model509> find(Long id);
}
