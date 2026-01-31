package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service572.model.Model572;
import java.util.Optional;

public interface Entity572DatasourcePort {
    Optional<Model572> find(Long id);
}
