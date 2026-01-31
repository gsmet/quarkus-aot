package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service324.model.Model324;
import java.util.Optional;

public interface Entity324DatasourcePort {
    Optional<Model324> find(Long id);
}
