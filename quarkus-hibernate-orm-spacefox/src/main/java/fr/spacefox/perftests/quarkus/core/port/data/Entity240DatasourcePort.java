package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service240.model.Model240;
import java.util.Optional;

public interface Entity240DatasourcePort {
    Optional<Model240> find(Long id);
}
