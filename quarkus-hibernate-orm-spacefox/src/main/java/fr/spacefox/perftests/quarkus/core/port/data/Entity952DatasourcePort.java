package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service952.model.Model952;
import java.util.Optional;

public interface Entity952DatasourcePort {
    Optional<Model952> find(Long id);
}
