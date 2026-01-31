package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service588.model.Model588;
import java.util.Optional;

public interface Entity588DatasourcePort {
    Optional<Model588> find(Long id);
}
