package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service684.model.Model684;
import java.util.Optional;

public interface Entity684DatasourcePort {
    Optional<Model684> find(Long id);
}
