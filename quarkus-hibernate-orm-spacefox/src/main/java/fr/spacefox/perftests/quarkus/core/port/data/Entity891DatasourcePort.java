package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service891.model.Model891;
import java.util.Optional;

public interface Entity891DatasourcePort {
    Optional<Model891> find(Long id);
}
