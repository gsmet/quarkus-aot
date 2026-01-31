package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service186.model.Model186;
import java.util.Optional;

public interface Entity186DatasourcePort {
    Optional<Model186> find(Long id);
}
