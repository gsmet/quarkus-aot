package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service615.model.Model615;
import java.util.Optional;

public interface Entity615DatasourcePort {
    Optional<Model615> find(Long id);
}
