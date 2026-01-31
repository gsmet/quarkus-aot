package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service921.model.Model921;
import java.util.Optional;

public interface Entity921DatasourcePort {
    Optional<Model921> find(Long id);
}
