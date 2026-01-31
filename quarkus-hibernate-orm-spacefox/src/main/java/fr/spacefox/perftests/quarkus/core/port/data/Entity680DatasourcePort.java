package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service680.model.Model680;
import java.util.Optional;

public interface Entity680DatasourcePort {
    Optional<Model680> find(Long id);
}
