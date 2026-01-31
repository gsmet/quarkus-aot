package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service974.model.Model974;
import java.util.Optional;

public interface Entity974DatasourcePort {
    Optional<Model974> find(Long id);
}
