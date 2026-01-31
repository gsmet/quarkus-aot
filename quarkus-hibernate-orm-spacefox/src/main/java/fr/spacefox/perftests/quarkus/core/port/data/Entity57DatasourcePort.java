package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service57.model.Model57;
import java.util.Optional;

public interface Entity57DatasourcePort {
    Optional<Model57> find(Long id);
}
