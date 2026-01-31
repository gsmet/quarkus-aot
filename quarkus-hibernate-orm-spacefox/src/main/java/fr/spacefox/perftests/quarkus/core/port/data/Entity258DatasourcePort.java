package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service258.model.Model258;
import java.util.Optional;

public interface Entity258DatasourcePort {
    Optional<Model258> find(Long id);
}
