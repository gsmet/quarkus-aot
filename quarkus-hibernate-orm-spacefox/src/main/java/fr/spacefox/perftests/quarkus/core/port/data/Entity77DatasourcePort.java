package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service77.model.Model77;
import java.util.Optional;

public interface Entity77DatasourcePort {
    Optional<Model77> find(Long id);
}
