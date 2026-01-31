package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service999.model.Model999;
import java.util.Optional;

public interface Entity999DatasourcePort {
    Optional<Model999> find(Long id);
}
