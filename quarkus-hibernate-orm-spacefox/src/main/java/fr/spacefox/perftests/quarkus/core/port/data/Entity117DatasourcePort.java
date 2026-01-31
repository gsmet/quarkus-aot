package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service117.model.Model117;
import java.util.Optional;

public interface Entity117DatasourcePort {
    Optional<Model117> find(Long id);
}
