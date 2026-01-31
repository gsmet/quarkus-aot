package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service897.model.Model897;
import java.util.Optional;

public interface Entity897DatasourcePort {
    Optional<Model897> find(Long id);
}
