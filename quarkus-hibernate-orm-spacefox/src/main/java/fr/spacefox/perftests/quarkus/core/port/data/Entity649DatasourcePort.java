package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service649.model.Model649;
import java.util.Optional;

public interface Entity649DatasourcePort {
    Optional<Model649> find(Long id);
}
