package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service455.model.Model455;
import java.util.Optional;

public interface Entity455DatasourcePort {
    Optional<Model455> find(Long id);
}
