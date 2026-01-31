package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service113.model.Model113;
import java.util.Optional;

public interface Entity113DatasourcePort {
    Optional<Model113> find(Long id);
}
