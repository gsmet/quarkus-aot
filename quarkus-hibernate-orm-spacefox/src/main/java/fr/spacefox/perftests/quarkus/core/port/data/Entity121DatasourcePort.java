package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service121.model.Model121;
import java.util.Optional;

public interface Entity121DatasourcePort {
    Optional<Model121> find(Long id);
}
