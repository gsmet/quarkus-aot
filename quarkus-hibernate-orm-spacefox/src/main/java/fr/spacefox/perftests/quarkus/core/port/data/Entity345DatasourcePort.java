package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service345.model.Model345;
import java.util.Optional;

public interface Entity345DatasourcePort {
    Optional<Model345> find(Long id);
}
