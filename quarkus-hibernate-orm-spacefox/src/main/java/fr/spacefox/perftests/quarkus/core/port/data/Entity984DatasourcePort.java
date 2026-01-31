package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service984.model.Model984;
import java.util.Optional;

public interface Entity984DatasourcePort {
    Optional<Model984> find(Long id);
}
