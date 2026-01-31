package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service5.model.Model5;
import java.util.Optional;

public interface Entity5DatasourcePort {
    Optional<Model5> find(Long id);
}
