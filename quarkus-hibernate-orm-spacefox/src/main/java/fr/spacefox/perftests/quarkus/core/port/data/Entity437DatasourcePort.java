package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service437.model.Model437;
import java.util.Optional;

public interface Entity437DatasourcePort {
    Optional<Model437> find(Long id);
}
