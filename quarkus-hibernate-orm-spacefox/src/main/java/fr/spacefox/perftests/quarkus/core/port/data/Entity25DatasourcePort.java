package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service25.model.Model25;
import java.util.Optional;

public interface Entity25DatasourcePort {
    Optional<Model25> find(Long id);
}
