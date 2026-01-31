package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service980.model.Model980;
import java.util.Optional;

public interface Entity980DatasourcePort {
    Optional<Model980> find(Long id);
}
