package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service389.model.Model389;
import java.util.Optional;

public interface Entity389DatasourcePort {
    Optional<Model389> find(Long id);
}
