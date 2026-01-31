package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service548.model.Model548;
import java.util.Optional;

public interface Entity548DatasourcePort {
    Optional<Model548> find(Long id);
}
