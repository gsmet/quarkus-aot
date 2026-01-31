package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service782.model.Model782;
import java.util.Optional;

public interface Entity782DatasourcePort {
    Optional<Model782> find(Long id);
}
