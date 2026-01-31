package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service767.model.Model767;
import java.util.Optional;

public interface Entity767DatasourcePort {
    Optional<Model767> find(Long id);
}
