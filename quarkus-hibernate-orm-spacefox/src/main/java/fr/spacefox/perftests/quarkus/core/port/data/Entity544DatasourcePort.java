package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service544.model.Model544;
import java.util.Optional;

public interface Entity544DatasourcePort {
    Optional<Model544> find(Long id);
}
