package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service203.model.Model203;
import java.util.Optional;

public interface Entity203DatasourcePort {
    Optional<Model203> find(Long id);
}
