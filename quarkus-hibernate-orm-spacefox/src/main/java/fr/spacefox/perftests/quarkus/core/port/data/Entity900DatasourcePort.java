package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service900.model.Model900;
import java.util.Optional;

public interface Entity900DatasourcePort {
    Optional<Model900> find(Long id);
}
