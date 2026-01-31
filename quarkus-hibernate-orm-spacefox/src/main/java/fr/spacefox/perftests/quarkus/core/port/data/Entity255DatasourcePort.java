package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service255.model.Model255;
import java.util.Optional;

public interface Entity255DatasourcePort {
    Optional<Model255> find(Long id);
}
