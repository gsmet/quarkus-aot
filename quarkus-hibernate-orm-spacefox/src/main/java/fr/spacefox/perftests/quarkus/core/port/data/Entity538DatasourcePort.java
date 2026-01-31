package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service538.model.Model538;
import java.util.Optional;

public interface Entity538DatasourcePort {
    Optional<Model538> find(Long id);
}
