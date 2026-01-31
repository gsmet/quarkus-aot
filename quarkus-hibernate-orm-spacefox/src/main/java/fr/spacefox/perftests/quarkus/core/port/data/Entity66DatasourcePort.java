package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service66.model.Model66;
import java.util.Optional;

public interface Entity66DatasourcePort {
    Optional<Model66> find(Long id);
}
