package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service825.model.Model825;
import java.util.Optional;

public interface Entity825DatasourcePort {
    Optional<Model825> find(Long id);
}
