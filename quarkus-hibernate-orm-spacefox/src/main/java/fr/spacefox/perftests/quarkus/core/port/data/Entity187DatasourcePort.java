package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service187.model.Model187;
import java.util.Optional;

public interface Entity187DatasourcePort {
    Optional<Model187> find(Long id);
}
