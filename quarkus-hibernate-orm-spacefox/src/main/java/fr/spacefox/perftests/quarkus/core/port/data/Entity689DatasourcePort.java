package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service689.model.Model689;
import java.util.Optional;

public interface Entity689DatasourcePort {
    Optional<Model689> find(Long id);
}
