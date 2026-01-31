package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service209.model.Model209;
import java.util.Optional;

public interface Entity209DatasourcePort {
    Optional<Model209> find(Long id);
}
