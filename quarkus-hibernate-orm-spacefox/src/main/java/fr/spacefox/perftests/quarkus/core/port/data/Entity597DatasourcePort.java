package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service597.model.Model597;
import java.util.Optional;

public interface Entity597DatasourcePort {
    Optional<Model597> find(Long id);
}
