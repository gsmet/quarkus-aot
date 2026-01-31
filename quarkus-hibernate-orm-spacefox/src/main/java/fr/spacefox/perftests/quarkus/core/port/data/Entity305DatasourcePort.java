package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service305.model.Model305;
import java.util.Optional;

public interface Entity305DatasourcePort {
    Optional<Model305> find(Long id);
}
