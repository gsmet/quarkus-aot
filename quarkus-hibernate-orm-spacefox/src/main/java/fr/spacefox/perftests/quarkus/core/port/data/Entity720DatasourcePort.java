package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service720.model.Model720;
import java.util.Optional;

public interface Entity720DatasourcePort {
    Optional<Model720> find(Long id);
}
