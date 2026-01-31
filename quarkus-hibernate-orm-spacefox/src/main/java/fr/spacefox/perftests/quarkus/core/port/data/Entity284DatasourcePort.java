package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service284.model.Model284;
import java.util.Optional;

public interface Entity284DatasourcePort {
    Optional<Model284> find(Long id);
}
