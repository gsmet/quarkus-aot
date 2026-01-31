package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service905.model.Model905;
import java.util.Optional;

public interface Entity905DatasourcePort {
    Optional<Model905> find(Long id);
}
