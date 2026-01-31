package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service382.model.Model382;
import java.util.Optional;

public interface Entity382DatasourcePort {
    Optional<Model382> find(Long id);
}
