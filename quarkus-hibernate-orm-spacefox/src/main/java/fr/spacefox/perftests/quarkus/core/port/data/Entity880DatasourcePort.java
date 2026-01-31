package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service880.model.Model880;
import java.util.Optional;

public interface Entity880DatasourcePort {
    Optional<Model880> find(Long id);
}
