package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service84.model.Model84;
import java.util.Optional;

public interface Entity84DatasourcePort {
    Optional<Model84> find(Long id);
}
