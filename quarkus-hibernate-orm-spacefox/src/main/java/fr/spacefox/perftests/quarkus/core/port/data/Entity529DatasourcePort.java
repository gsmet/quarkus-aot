package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service529.model.Model529;
import java.util.Optional;

public interface Entity529DatasourcePort {
    Optional<Model529> find(Long id);
}
