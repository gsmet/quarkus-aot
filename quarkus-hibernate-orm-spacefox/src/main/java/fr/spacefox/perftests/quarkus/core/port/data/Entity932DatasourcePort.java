package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service932.model.Model932;
import java.util.Optional;

public interface Entity932DatasourcePort {
    Optional<Model932> find(Long id);
}
