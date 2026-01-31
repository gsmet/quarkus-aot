package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service71.model.Model71;
import java.util.Optional;

public interface Entity71DatasourcePort {
    Optional<Model71> find(Long id);
}
