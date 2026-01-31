package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service435.model.Model435;
import java.util.Optional;

public interface Entity435DatasourcePort {
    Optional<Model435> find(Long id);
}
