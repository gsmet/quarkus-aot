package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service856.model.Model856;
import java.util.Optional;

public interface Entity856DatasourcePort {
    Optional<Model856> find(Long id);
}
