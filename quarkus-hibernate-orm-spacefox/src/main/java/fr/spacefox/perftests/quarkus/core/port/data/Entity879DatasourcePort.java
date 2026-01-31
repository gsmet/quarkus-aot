package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service879.model.Model879;
import java.util.Optional;

public interface Entity879DatasourcePort {
    Optional<Model879> find(Long id);
}
