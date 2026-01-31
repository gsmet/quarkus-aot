package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service346.model.Model346;
import java.util.Optional;

public interface Entity346DatasourcePort {
    Optional<Model346> find(Long id);
}
