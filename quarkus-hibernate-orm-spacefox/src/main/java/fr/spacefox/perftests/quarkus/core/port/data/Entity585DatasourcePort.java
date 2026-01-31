package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service585.model.Model585;
import java.util.Optional;

public interface Entity585DatasourcePort {
    Optional<Model585> find(Long id);
}
