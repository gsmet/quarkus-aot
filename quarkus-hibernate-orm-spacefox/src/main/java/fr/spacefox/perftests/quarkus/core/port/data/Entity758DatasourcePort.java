package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service758.model.Model758;
import java.util.Optional;

public interface Entity758DatasourcePort {
    Optional<Model758> find(Long id);
}
