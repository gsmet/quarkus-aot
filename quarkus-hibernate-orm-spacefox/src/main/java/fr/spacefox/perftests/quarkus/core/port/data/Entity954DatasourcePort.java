package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service954.model.Model954;
import java.util.Optional;

public interface Entity954DatasourcePort {
    Optional<Model954> find(Long id);
}
