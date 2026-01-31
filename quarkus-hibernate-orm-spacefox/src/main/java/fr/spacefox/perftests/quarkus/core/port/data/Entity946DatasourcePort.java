package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service946.model.Model946;
import java.util.Optional;

public interface Entity946DatasourcePort {
    Optional<Model946> find(Long id);
}
