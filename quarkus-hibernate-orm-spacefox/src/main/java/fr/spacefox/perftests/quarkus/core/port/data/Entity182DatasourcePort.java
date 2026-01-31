package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service182.model.Model182;
import java.util.Optional;

public interface Entity182DatasourcePort {
    Optional<Model182> find(Long id);
}
