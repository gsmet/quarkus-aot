package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service802.model.Model802;
import java.util.Optional;

public interface Entity802DatasourcePort {
    Optional<Model802> find(Long id);
}
