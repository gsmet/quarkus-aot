package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service296.model.Model296;
import java.util.Optional;

public interface Entity296DatasourcePort {
    Optional<Model296> find(Long id);
}
