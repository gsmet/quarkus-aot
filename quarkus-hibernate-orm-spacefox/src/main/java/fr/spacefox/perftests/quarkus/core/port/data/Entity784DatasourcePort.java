package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service784.model.Model784;
import java.util.Optional;

public interface Entity784DatasourcePort {
    Optional<Model784> find(Long id);
}
