package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service979.model.Model979;
import java.util.Optional;

public interface Entity979DatasourcePort {
    Optional<Model979> find(Long id);
}
