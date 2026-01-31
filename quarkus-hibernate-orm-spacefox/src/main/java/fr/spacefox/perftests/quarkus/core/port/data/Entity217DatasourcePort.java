package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service217.model.Model217;
import java.util.Optional;

public interface Entity217DatasourcePort {
    Optional<Model217> find(Long id);
}
