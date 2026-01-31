package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service327.model.Model327;
import java.util.Optional;

public interface Entity327DatasourcePort {
    Optional<Model327> find(Long id);
}
