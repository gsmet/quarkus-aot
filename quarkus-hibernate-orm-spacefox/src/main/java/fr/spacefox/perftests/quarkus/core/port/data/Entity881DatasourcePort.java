package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service881.model.Model881;
import java.util.Optional;

public interface Entity881DatasourcePort {
    Optional<Model881> find(Long id);
}
