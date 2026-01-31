package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service477.model.Model477;
import java.util.Optional;

public interface Entity477DatasourcePort {
    Optional<Model477> find(Long id);
}
