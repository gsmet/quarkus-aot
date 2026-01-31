package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service26.model.Model26;
import java.util.Optional;

public interface Entity26DatasourcePort {
    Optional<Model26> find(Long id);
}
