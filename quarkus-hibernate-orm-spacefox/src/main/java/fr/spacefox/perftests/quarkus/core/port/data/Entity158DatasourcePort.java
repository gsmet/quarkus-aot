package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service158.model.Model158;
import java.util.Optional;

public interface Entity158DatasourcePort {
    Optional<Model158> find(Long id);
}
