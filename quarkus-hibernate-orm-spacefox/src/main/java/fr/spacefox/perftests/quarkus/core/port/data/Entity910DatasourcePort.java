package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service910.model.Model910;
import java.util.Optional;

public interface Entity910DatasourcePort {
    Optional<Model910> find(Long id);
}
