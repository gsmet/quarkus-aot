package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service934.model.Model934;
import java.util.Optional;

public interface Entity934DatasourcePort {
    Optional<Model934> find(Long id);
}
