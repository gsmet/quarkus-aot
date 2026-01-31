package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service206.model.Model206;
import java.util.Optional;

public interface Entity206DatasourcePort {
    Optional<Model206> find(Long id);
}
