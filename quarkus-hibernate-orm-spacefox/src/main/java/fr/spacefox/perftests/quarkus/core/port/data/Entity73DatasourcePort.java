package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service73.model.Model73;
import java.util.Optional;

public interface Entity73DatasourcePort {
    Optional<Model73> find(Long id);
}
