package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service419.model.Model419;
import java.util.Optional;

public interface Entity419DatasourcePort {
    Optional<Model419> find(Long id);
}
