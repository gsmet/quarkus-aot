package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service473.model.Model473;
import java.util.Optional;

public interface Entity473DatasourcePort {
    Optional<Model473> find(Long id);
}
