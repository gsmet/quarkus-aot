package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service184.model.Model184;
import java.util.Optional;

public interface Entity184DatasourcePort {
    Optional<Model184> find(Long id);
}
