package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service618.model.Model618;
import java.util.Optional;

public interface Entity618DatasourcePort {
    Optional<Model618> find(Long id);
}
