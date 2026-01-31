package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service378.model.Model378;
import java.util.Optional;

public interface Entity378DatasourcePort {
    Optional<Model378> find(Long id);
}
