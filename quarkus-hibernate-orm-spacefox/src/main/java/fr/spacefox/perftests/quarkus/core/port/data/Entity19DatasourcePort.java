package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service19.model.Model19;
import java.util.Optional;

public interface Entity19DatasourcePort {
    Optional<Model19> find(Long id);
}
