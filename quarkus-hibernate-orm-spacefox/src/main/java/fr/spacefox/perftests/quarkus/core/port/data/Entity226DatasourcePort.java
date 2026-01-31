package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service226.model.Model226;
import java.util.Optional;

public interface Entity226DatasourcePort {
    Optional<Model226> find(Long id);
}
