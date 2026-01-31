package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service439.model.Model439;
import java.util.Optional;

public interface Entity439DatasourcePort {
    Optional<Model439> find(Long id);
}
