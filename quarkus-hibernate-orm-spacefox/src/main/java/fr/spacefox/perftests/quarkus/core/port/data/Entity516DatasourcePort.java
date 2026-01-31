package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service516.model.Model516;
import java.util.Optional;

public interface Entity516DatasourcePort {
    Optional<Model516> find(Long id);
}
