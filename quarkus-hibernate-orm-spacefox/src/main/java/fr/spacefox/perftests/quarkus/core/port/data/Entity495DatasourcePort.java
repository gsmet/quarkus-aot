package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service495.model.Model495;
import java.util.Optional;

public interface Entity495DatasourcePort {
    Optional<Model495> find(Long id);
}
