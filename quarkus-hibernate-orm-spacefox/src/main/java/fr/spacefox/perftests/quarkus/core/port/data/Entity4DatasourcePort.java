package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service4.model.Model4;
import java.util.Optional;

public interface Entity4DatasourcePort {
    Optional<Model4> find(Long id);
}
