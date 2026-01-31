package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service373.model.Model373;
import java.util.Optional;

public interface Entity373DatasourcePort {
    Optional<Model373> find(Long id);
}
