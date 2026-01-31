package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service740.model.Model740;
import java.util.Optional;

public interface Entity740DatasourcePort {
    Optional<Model740> find(Long id);
}
