package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service565.model.Model565;
import java.util.Optional;

public interface Entity565DatasourcePort {
    Optional<Model565> find(Long id);
}
