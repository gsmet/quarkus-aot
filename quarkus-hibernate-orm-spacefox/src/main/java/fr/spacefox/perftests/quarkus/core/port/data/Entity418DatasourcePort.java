package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service418.model.Model418;
import java.util.Optional;

public interface Entity418DatasourcePort {
    Optional<Model418> find(Long id);
}
