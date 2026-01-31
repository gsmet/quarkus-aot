package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service540.model.Model540;
import java.util.Optional;

public interface Entity540DatasourcePort {
    Optional<Model540> find(Long id);
}
