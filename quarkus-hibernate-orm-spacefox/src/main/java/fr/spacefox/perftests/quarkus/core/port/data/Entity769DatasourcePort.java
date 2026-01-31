package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service769.model.Model769;
import java.util.Optional;

public interface Entity769DatasourcePort {
    Optional<Model769> find(Long id);
}
