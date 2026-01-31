package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service834.model.Model834;
import java.util.Optional;

public interface Entity834DatasourcePort {
    Optional<Model834> find(Long id);
}
