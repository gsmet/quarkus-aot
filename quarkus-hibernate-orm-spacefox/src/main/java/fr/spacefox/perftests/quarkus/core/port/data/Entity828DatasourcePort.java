package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service828.model.Model828;
import java.util.Optional;

public interface Entity828DatasourcePort {
    Optional<Model828> find(Long id);
}
