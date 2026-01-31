package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service850.model.Model850;
import java.util.Optional;

public interface Entity850DatasourcePort {
    Optional<Model850> find(Long id);
}
