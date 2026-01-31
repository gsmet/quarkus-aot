package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service375.model.Model375;
import java.util.Optional;

public interface Entity375DatasourcePort {
    Optional<Model375> find(Long id);
}
