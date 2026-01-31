package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service292.model.Model292;
import java.util.Optional;

public interface Entity292DatasourcePort {
    Optional<Model292> find(Long id);
}
