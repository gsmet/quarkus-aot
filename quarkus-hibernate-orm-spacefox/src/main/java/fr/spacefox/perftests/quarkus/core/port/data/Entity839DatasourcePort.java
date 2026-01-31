package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service839.model.Model839;
import java.util.Optional;

public interface Entity839DatasourcePort {
    Optional<Model839> find(Long id);
}
