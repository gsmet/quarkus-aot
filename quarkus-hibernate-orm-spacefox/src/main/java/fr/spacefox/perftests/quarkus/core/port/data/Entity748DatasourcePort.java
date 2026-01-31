package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service748.model.Model748;
import java.util.Optional;

public interface Entity748DatasourcePort {
    Optional<Model748> find(Long id);
}
