package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service574.model.Model574;
import java.util.Optional;

public interface Entity574DatasourcePort {
    Optional<Model574> find(Long id);
}
