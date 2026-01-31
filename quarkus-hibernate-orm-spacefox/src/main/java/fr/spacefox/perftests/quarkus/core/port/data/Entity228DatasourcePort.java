package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service228.model.Model228;
import java.util.Optional;

public interface Entity228DatasourcePort {
    Optional<Model228> find(Long id);
}
