package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service823.model.Model823;
import java.util.Optional;

public interface Entity823DatasourcePort {
    Optional<Model823> find(Long id);
}
