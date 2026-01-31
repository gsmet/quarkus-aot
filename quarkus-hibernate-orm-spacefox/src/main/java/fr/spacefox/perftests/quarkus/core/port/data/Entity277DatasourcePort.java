package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service277.model.Model277;
import java.util.Optional;

public interface Entity277DatasourcePort {
    Optional<Model277> find(Long id);
}
