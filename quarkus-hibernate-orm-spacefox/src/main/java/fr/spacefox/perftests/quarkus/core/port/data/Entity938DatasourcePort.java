package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service938.model.Model938;
import java.util.Optional;

public interface Entity938DatasourcePort {
    Optional<Model938> find(Long id);
}
