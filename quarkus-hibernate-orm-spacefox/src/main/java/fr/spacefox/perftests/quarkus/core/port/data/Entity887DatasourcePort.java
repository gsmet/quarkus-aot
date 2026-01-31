package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service887.model.Model887;
import java.util.Optional;

public interface Entity887DatasourcePort {
    Optional<Model887> find(Long id);
}
