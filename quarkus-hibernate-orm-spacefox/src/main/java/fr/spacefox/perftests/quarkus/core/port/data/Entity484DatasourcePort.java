package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service484.model.Model484;
import java.util.Optional;

public interface Entity484DatasourcePort {
    Optional<Model484> find(Long id);
}
