package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service352.model.Model352;
import java.util.Optional;

public interface Entity352DatasourcePort {
    Optional<Model352> find(Long id);
}
