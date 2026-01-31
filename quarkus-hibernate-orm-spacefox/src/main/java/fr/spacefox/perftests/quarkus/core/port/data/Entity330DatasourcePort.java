package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service330.model.Model330;
import java.util.Optional;

public interface Entity330DatasourcePort {
    Optional<Model330> find(Long id);
}
