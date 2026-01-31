package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service132.model.Model132;
import java.util.Optional;

public interface Entity132DatasourcePort {
    Optional<Model132> find(Long id);
}
