package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service423.model.Model423;
import java.util.Optional;

public interface Entity423DatasourcePort {
    Optional<Model423> find(Long id);
}
