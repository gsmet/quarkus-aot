package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service796.model.Model796;
import java.util.Optional;

public interface Entity796DatasourcePort {
    Optional<Model796> find(Long id);
}
