package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service990.model.Model990;
import java.util.Optional;

public interface Entity990DatasourcePort {
    Optional<Model990> find(Long id);
}
