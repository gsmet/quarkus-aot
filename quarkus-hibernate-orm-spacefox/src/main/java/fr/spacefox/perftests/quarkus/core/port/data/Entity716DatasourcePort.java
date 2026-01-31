package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service716.model.Model716;
import java.util.Optional;

public interface Entity716DatasourcePort {
    Optional<Model716> find(Long id);
}
