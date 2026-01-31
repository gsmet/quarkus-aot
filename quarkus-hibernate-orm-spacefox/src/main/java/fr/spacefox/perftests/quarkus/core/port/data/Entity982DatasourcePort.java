package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service982.model.Model982;
import java.util.Optional;

public interface Entity982DatasourcePort {
    Optional<Model982> find(Long id);
}
