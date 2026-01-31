package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service532.model.Model532;
import java.util.Optional;

public interface Entity532DatasourcePort {
    Optional<Model532> find(Long id);
}
