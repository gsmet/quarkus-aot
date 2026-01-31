package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service269.model.Model269;
import java.util.Optional;

public interface Entity269DatasourcePort {
    Optional<Model269> find(Long id);
}
