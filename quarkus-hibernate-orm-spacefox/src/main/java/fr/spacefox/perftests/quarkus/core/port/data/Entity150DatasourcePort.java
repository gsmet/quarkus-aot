package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service150.model.Model150;
import java.util.Optional;

public interface Entity150DatasourcePort {
    Optional<Model150> find(Long id);
}
