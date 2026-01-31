package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service692.model.Model692;
import java.util.Optional;

public interface Entity692DatasourcePort {
    Optional<Model692> find(Long id);
}
