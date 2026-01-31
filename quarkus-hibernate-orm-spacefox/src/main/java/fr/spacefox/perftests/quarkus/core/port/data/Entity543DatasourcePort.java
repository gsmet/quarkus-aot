package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service543.model.Model543;
import java.util.Optional;

public interface Entity543DatasourcePort {
    Optional<Model543> find(Long id);
}
