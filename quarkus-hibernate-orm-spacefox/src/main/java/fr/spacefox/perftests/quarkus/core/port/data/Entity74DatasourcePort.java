package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service74.model.Model74;
import java.util.Optional;

public interface Entity74DatasourcePort {
    Optional<Model74> find(Long id);
}
