package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service61.model.Model61;
import java.util.Optional;

public interface Entity61DatasourcePort {
    Optional<Model61> find(Long id);
}
