package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service496.model.Model496;
import java.util.Optional;

public interface Entity496DatasourcePort {
    Optional<Model496> find(Long id);
}
