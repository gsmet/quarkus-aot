package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service490.model.Model490;
import java.util.Optional;

public interface Entity490DatasourcePort {
    Optional<Model490> find(Long id);
}
