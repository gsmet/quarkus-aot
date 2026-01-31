package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service130.model.Model130;
import java.util.Optional;

public interface Entity130DatasourcePort {
    Optional<Model130> find(Long id);
}
