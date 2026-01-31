package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service650.model.Model650;
import java.util.Optional;

public interface Entity650DatasourcePort {
    Optional<Model650> find(Long id);
}
