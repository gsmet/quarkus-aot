package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service223.model.Model223;
import java.util.Optional;

public interface Entity223DatasourcePort {
    Optional<Model223> find(Long id);
}
